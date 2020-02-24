package javalearn;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * java的四种引用方式
 */
public class Reference {
    private void reference() {
        //强引用
        Reference r = new Reference();

        //弱引用
        WeakReference<Reference> referenceWeakReference = new WeakReference<Reference>(new Reference());
        Reference reference = referenceWeakReference.get();
        if (reference != null) {
            System.out.println("弱引用不为空");
        } else {
            System.out.println("弱引用为空");
        }

        //软引用
        SoftReference<Reference> referenceSoftReference = new SoftReference<Reference>(new Reference());
        Reference reference1 = referenceSoftReference.get();
        if (reference1 != null) {
            System.out.println("软引用不为空");
        } else {
            System.out.println("软引用为空");
        }

        /*
          虚引用
          随时可能被回收
          回收时会把待回收的对象放到引用队列里，可以通过判断引用队列里的元素，得知是否即将被回收，采取必要措施
          */
        ReferenceQueue<String> queue = new ReferenceQueue<>();
        PhantomReference<String> pr = new PhantomReference<>("1234", queue);
        System.out.println(pr.get());
    }
}
