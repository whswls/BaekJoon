import Foundation

func solution(_ arr:[String]) -> String {
    var result: [Character] = []
    for i in 0..<min(200, arr.count) {
        result.append(contentsOf: arr[i])
    }
    return String(result)
}