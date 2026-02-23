package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135s extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f337short = {3178, 3123, 3135, 3134, 3108, 3121, 3129, 3134, 3107, 3192, 3189, 3107, 3193};
    private final String a;

    public C0135s(String str) {
        this.a = C0055.m8795(str);
    }

    /* renamed from: ۡۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m2727() {
        if (C0045.m7538() <= 0) {
            return f337short;
        }
        return null;
    }

    /* renamed from: ۣۣۧ, reason: not valid java name and contains not printable characters */
    public static String m2728(Object obj) {
        if (C0036.m6252() > 0) {
            return ((C0135s) obj).a;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        return C0058.m9127(C0055.m8795(C0053.m8412(lVar2)), m2728(this));
    }

    public final String toString() {
        return C0002.m1327(C0024.m4740(m2727(), 0, 13, 3152), new Object[]{m2728(this)});
    }
}