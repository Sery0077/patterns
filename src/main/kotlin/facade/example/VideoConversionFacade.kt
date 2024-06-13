package facade.example

import facade.example.codec.CodecFactory
import facade.example.codec.MP4Codec
import facade.example.codec.OggCodec
import facade.example.media_library.AudioMixer
import facade.example.media_library.BitrateReader.convert
import facade.example.media_library.BitrateReader.read
import facade.example.media_library.VideoFile
import java.io.File

class VideoConversionFacade {
    fun convertVideo(fileName: String, format: String): File {
        println("VideoConversionFacade: conversion started.")
        val videoFile = VideoFile(fileName)
        val sourceCodec = CodecFactory.extract(videoFile)
        val destinationCodec = if (format == "mp4") {
            MP4Codec()
        } else {
            OggCodec()
        }
        val buffer = read(videoFile, sourceCodec)
        val intermediateResult = convert(buffer, destinationCodec)
        val result: File = AudioMixer.fix(intermediateResult)
        println("VideoConversionFacade: conversion completed.")
        return result
    }
}