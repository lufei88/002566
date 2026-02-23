package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130m extends AbstractC0127j {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f331short = {2921, 2839, 2881, 2840, 2831, 2839, 2881, 2927};

    public C0130m(String str, String str2) {
        super(str, str2, true);
    }

    /* renamed from: ۣ۟۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static short[] m2710() {
        if (C0010.m2320() <= 0) {
            return f331short;
        }
        return null;
    }

    /* renamed from: ۟۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static String m2711(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((AbstractC0127j) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦۦ۟, reason: not valid java name and contains not printable characters */
    public static String m2712(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((AbstractC0127j) obj).a;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        return C0040.m6638(lVar2, m2712(this)) && C0058.m9127(C0055.m8795(C0058.m9094(lVar2, m2712(this))), m2711(this));
    }

    public final String toString() {
        return C0002.m1327(C0014.m3332(m2710(), 0, 8, 2866), new Object[]{m2712(this), m2711(this)});
    }
}