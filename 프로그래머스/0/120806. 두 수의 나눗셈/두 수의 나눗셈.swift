import Foundation

func solution(_ num1:Int, _ num2:Int) -> Int {
    var result: Double = Double(num1)/Double(num2) 
    return Int(result*1000)
}