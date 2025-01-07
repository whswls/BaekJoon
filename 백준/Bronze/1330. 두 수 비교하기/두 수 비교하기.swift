import Foundation

let input = readLine()!.split(separator: " ")

let a = Int(input[0])!
let b = Int(input[1])!

if a > b {
    print(">")
} else if a < b {
    print("<")
} else {
    print("==")
}