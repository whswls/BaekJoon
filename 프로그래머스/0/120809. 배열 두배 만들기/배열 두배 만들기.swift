import Foundation

func solution(_ numbers:[Int]) -> [Int] {
    var results: [Int] = []
    for i in 0..<numbers.count {
        results.append(2*numbers[i])
    }    
    return results
}