package cn.cuibg.wanandroid.data

/**
 * description :
 * created time: 2020/11/12 17:12
 * created by: cuibenguang
 */
data class Response<T>(
    var data: T?,
    var errorCode: Int,
    var errorMsg: String?
) {

}