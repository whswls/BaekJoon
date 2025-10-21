import Foundation

func solution(_ my_string:String, _ k:Int) -> String {
    var result: [Character] = []
    for i in 0..<k {
        result.append(contentsOf: my_string)
    }
    return String(result)
}