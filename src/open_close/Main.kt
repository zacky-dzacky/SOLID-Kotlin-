package open_close

val postUmum = Post("Judul", "Description", PostType.UMUM)
val postGambar = Post("Judul", "Description", PostType.GAMBAR)
val postVideo = Post("Judul", "Description", PostType.VIDEO)

val umumPost: UmumPost = UmumPost()
val gambarPost: GambarPost = GambarPost()
val videoPost: VideoPost = VideoPost()


fun main() {

    umumPost.post(postUmum)
    gambarPost.post(postGambar)
    videoPost.post(postVideo)
}
