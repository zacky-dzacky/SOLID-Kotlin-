package open_close
//Pada Contoh 1 jika kita ingin menambahkan Shipping tipe (mis. VIDEO)
//maka kita harus mengubah class shipping service.
//Jika kita mengikuti aturan OCP, mengubah tidak diizinkan tidak diizinikan
//Solusi untuk ini adalah Contoh 2

/* ---------------------- Contoh 1 --------------------- */
class ShippingService(){

    fun calculate(product: Post, type: PostType){
        when(type){
            PostType.UMUM -> "" /* */
            PostType.GAMBAR -> ""
        }
    }
}
/* --------------------- End Contoh 1 -------------------- */


/* ------------------ Contoh 2 ----------------- */
abstract class PostInterface{
    abstract fun post(post: Post)
}

class UmumPost: PostInterface() {
    override fun post(post: Post) {
        println("OpenClose.Post Umum")
    }
}

class GambarPost: PostInterface(){
    override fun post(post: Post) {
        println("OpenClose.Post Gambar")
    }
}

class VideoPost: PostInterface(){
    override fun post(post: Post) {
        println("OpenClose.Post Gambar")
    }
}

/* ----------------- End Contoh 2 ------------------- */
