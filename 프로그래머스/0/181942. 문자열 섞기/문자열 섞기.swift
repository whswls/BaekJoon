import Foundation

func solution(_ str1:String, _ str2:String) -> String {
    var a = Array(str1)
    var b = Array(str2)
    var result: [Character] = []
    for i in 0..<min(a.count, b.count) {
        result.append(a[i])
        result.append(b[i])
    }
    return String(result)
}