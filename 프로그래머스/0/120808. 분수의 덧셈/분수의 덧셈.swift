import Foundation

func solution(_ numer1:Int, _ denom1:Int, _ numer2:Int, _ denom2:Int) -> [Int] {
    var numer = numer1 * denom2 + numer2 * denom1
    // 공통 분모
    var denom = denom1 * denom2
    // 최대 공약수
    func gcd(_ a: Int, _ b: Int) -> Int {
        return b == 0 ? a : gcd(b, a % b) 
    }
    var divisor = gcd(numer, denom)
    return [numer/divisor, denom/divisor]
}