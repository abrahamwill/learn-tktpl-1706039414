#include <jni.h>
#include <string.h>
#include <string>


extern "C"
JNIEXPORT jstring JNICALL Java_id_ac_ui_cs_mobileprogramming_helloworld_MainActivity_simplefun(JNIEnv* env, jobject){
    std::string hello = "hello from cpp";
    return env->NewStringUTF(hello.c_str());
}