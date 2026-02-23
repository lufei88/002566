package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* loaded from: classes.dex */
public final class r extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f336short = {3072, 3161, 3157, 3156, 3150, 3163, 3155, 3156, 3145, 3189, 3149, 3156, 3090, 3103, 3145, 3091};
    private final String a;

    public r(String str) {
        this.a = C0055.m8795(str);
    }

    /* renamed from: ۣ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static short[] m2725() {
        if (C0054.m8557() <= 0) {
            return f336short;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static String m2726(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((r) obj).a;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        return C0058.m9127(C0055.m8795(C0065.m9718(lVar2)), m2726(this));
    }

    public final String toString() {
        return C0002.m1327(C0057.m8978(m2725(), 0, 16, 3130), new Object[]{m2726(this)});
    }
}