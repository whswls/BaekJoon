import Foundation

func solution(_ a:Int, _ b:Int) -> Int {
    var result1: String = String(a)+String(b)
    var result2: String = String(b)+String(a)
    if let resultA = Int(result1), let resultB = Int(result2) {
        return max(resultA, resultB)
    } else {
        return 0
    }
    

}