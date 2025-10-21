import Foundation

func solution(_ a:Int, _ b:Int) -> Int {
    var result1: String = String(a) + String(b)
    if let result = Int(result1) {
        return max(result, 2*a*b)
    } else {
        return 0
    }
}