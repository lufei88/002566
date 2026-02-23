package com.github.catvod.spider.merge.w0;

import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.t.C0061;

/* loaded from: classes.dex */
public abstract class j {
    public static final k a;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f870short = {3174, 3170, 3193, 3169, 3172, 3171, 3107, 3199, 3176, 3179, 3169, 3176, 3182, 3193, 3107, 3175, 3195, 3168, 3107, 3172, 3171, 3193, 3176, 3199, 3171, 3180, 3169, 3107, 3167, 3176, 3179, 3169, 3176, 3182, 3193, 3172, 3170, 3171, 3147, 3180, 3182, 3193, 3170, 3199, 3188, 3140, 3168, 3197, 3169};

    static {
        k kVar = null;
        try {
            kVar = (k) m9484(C0021.m4369(C0034.m6001(m9483(), 0, 49, 3085)));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (kVar == null) {
            kVar = new k();
        }
        a = kVar;
    }

    /* renamed from: ۟۟ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static short[] m9483() {
        if (C0058.m9131() < 0) {
            return f870short;
        }
        return null;
    }

    /* renamed from: ۥۨ۠ۦ, reason: contains not printable characters */
    public static Object m9484(Object obj) {
        if (C0061.m9359() < 0) {
            return ((Class) obj).newInstance();
        }
        return null;
    }
}