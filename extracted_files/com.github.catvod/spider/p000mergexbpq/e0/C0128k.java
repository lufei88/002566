package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.c0.a;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128k extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f329short = {2256, 2261, 2222, 2296, 2262, 3092, 3149, 3137, 3136, 3162, 3151, 3143, 3136, 3165, 3178, 3151, 3162, 3151, 3078, 3083, 3165, 3079};
    public final /* synthetic */ int a;
    private final String b;

    public C0128k(String str, int i) {
        this.a = i;
        if (i == 1) {
            this.b = C0055.m8795(str);
        } else {
            C0006.m1786(str);
            this.b = C0055.m8795(str);
        }
    }

    /* renamed from: ۟ۦۨۨ۠, reason: not valid java name and contains not printable characters */
    public static short[] m2705() {
        if (C0047.m7837() >= 0) {
            return f329short;
        }
        return null;
    }

    /* renamed from: ۣۡۢۤ, reason: not valid java name and contains not printable characters */
    public static String m2706(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((C0128k) obj).b;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        switch (C0011.m2765(this)) {
            case 0:
                Iterator itM3109 = C0013.m3109(C0063.m9520(C0056.m8893(lVar2)));
                while (C0012.m2962(itM3109)) {
                    if (C0043.m7277(C0055.m8795(C0049.m7990((a) C0048.m7949(itM3109))), m2706(this))) {
                        return true;
                    }
                }
                return false;
            default:
                return C0058.m9127(C0055.m8795(C0025.m4799(lVar2)), m2706(this));
        }
    }

    public final String toString() {
        switch (C0011.m2765(this)) {
            case 0:
                return C0002.m1327(C0013.m3106(m2705(), 0, 5, 2187), new Object[]{m2706(this)});
            default:
                return C0002.m1327(C0032.m5708(m2705(), 5, 17, 3118), new Object[]{m2706(this)});
        }
    }
}