import Foundation

func solution(_ my_string:String, _ overwrite_string:String, _ s:Int) -> String {
    var my_str = Array(my_string)
    var overwrite_str = Array(overwrite_string)
    var a = overwrite_str.count
    for i in 0..<a {
        my_str[s+i] = overwrite_str[i]
    }
    return String(my_str)
}
