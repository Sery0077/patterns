package facade.example.media_library

import facade.example.codec.Codec

object BitrateReader {
    fun read(file: VideoFile, codec: Codec): VideoFile {
        println("BitrateReader: reading file")
        return file
    }

    fun convert(buffer: VideoFile, codec: Codec): VideoFile {
        println("BitrateReader: converting file")
        return buffer
    }
}