package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134q extends AbstractC0127j {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f335short = {1469, 1475, 1429, 1464, 1499, 1475, 1429, 1467};

    public C0134q(String str, String str2) {
        super(str, str2, false);
    }

    /* renamed from: ۟ۡۨۧ, reason: not valid java name and contains not printable characters */
    public static String m2722(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((AbstractC0127j) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۤۧۥۤ, reason: not valid java name and contains not printable characters */
    public static String m2723(Object obj) {
        if (C0054.m8557() < 0) {
            return ((AbstractC0127j) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static short[] m2724() {
        if (C0039.m6529() <= 0) {
            return f335short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        return C0040.m6638(lVar2, m2722(this)) && C0043.m7277(C0055.m8795(C0058.m9094(lVar2, m2722(this))), m2723(this));
    }

    public final String toString() {
        return C0002.m1327(C0065.m9775(m2724(), 0, 8, 1510), new Object[]{m2722(this), m2723(this)});
    }
}