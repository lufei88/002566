package com.github.catvod.spider.merge.i1;

import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes.dex */
public final class c {
    public static final Class d;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f827short = {441, 419, 1156, 1183, 1150, 1138, 1128, 1137, 1145, 1085, 1139, 1138, 1129, 1085, 1150, 1135, 1144, 1148, 1129, 1144, 1085, 1133, 1148, 1135, 1134, 1144, 1135, 1063, 1085, 3148, 3181, 3106, 3188, 3171, 3182, 3179, 3174, 3106, 3186, 3171, 3184, 3185, 3175, 3184, 3106, 3169, 3182, 3171, 3185, 3185, 3175, 3185, 3106, 3172, 3181, 3191, 3180, 3174, 3106, 3179, 3180, 3106, 2677, 2642, 2640, 2631, 2652, 2625, 2634, 2579, 2650, 2653, 2650, 2631, 2650, 2642, 2655, 2650, 2633, 2642, 2631, 2650, 2652, 2653, 2579, 2628, 2642, 2624, 2579, 2650, 2653, 2640, 2652, 2654, 2627, 2655, 2646, 2631, 2646, 2579, 2590, 2579, 2651, 2642, 2624, 2579, 2653, 2652, 2631, 2579, 2631, 2625, 2650, 2646, 2647, 2579};
    public Vector a;
    public String b;
    public final Hashtable c = new Hashtable();

    static {
        new c();
        d = c.class;
    }

    /* renamed from: ۟۟ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static Object m8817(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((Class) obj).newInstance();
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m8818() {
        if (C0059.m9257() <= 0) {
            return f827short;
        }
        return null;
    }

    public final void a() throws b {
        Vector vectorM1790 = C0006.m1790(this);
        if (vectorM1790 == null) {
            StringBuffer stringBuffer = new StringBuffer(C0039.m6551(m8818(), 62, 54, 2611));
            C0051.m8251(stringBuffer, C0008.m1949(this));
            throw new b(C0058.m9069(stringBuffer));
        }
        if (C0043.m7372(vectorM1790) == 0) {
            StringBuffer stringBuffer2 = new StringBuffer(C0049.m8007(m8818(), 29, 33, 3074));
            C0051.m8251(stringBuffer2, C0008.m1949(this));
            throw new b(C0058.m9069(stringBuffer2));
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        for (int i = 0; i < C0043.m7372(C0006.m1790(this)); i++) {
            Class cls = (Class) C0051.m8196(C0006.m1790(this), i);
            try {
                C0022.m4478(m8817(cls));
                Hashtable hashtableM2954 = C0012.m2954(this);
                Enumeration enumerationM5357 = C0030.m5357(hashtableM2954);
                while (C0034.m6038(enumerationM5357)) {
                    Boolean bool = (Boolean) C0048.m7913(hashtableM2954, (String) C0033.m5838(enumerationM5357));
                    if (bool != null && C0010.m2318(bool)) {
                        throw null;
                    }
                }
                return;
            } catch (Exception e) {
                StringBuffer stringBuffer4 = new StringBuffer();
                C0051.m8251(stringBuffer4, C0013.m3085(cls));
                C0051.m8251(stringBuffer4, C0048.m7902(m8818(), 0, 2, 387));
                C0051.m8251(stringBuffer4, C0037.m6312(e));
                C0051.m8251(stringBuffer4, C0025.m4795(m8818(), 2, 2, 1215));
                C0051.m8251(stringBuffer3, C0058.m9069(stringBuffer4));
            }
        }
        StringBuffer stringBuffer5 = new StringBuffer(C0045.m7657(m8818(), 4, 25, 1053));
        C0039.m6541(stringBuffer5, stringBuffer3);
        throw new b(C0058.m9069(stringBuffer5));
    }
}