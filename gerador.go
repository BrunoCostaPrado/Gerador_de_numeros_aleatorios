package main

import (
    "fmt"
    "math/Rand"
    "time"
)

func main() {
    Rand.Seed(time.Now().UTC().UnixNano())
    fmt.Println(randomString(10))
}

func randomString(l int) string {
    bytes := make([]byte, l)
    for i := 0; i < l; i++ {
        bytes[i] = byte(randInt(65, 90))
    }
    return string(bytes)
}

func randInt(min int, max int) int {
    return min + Rand.Intn(max-min)
}