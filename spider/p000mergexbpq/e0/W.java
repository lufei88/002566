package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* loaded from: classes.dex */
final class W extends Z {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f322short = {682, 764, 687};

    public W(N n) {
        this.a = n;
    }

    /* renamed from: ۦۦۡۨ, reason: contains not printable characters */
    public static N m2680(Object obj) {
        if (C0031.m5628() > 0) {
            return ((Z) obj).a;
        }
        return null;
    }

    /* renamed from: ۨۥۤ۠, reason: not valid java name and contains not printable characters */
    public static short[] m2681() {
        if (C0033.m5872() >= 0) {
            return f322short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        l lVarM9066 = lVar2;
        if (lVar == lVarM9066) {
            return false;
        }
        do {
            lVarM9066 = C0058.m9066(lVarM9066);
            if (lVarM9066 == null) {
                break;
            }
            if (C0007.m1805(m2680(this), lVar, lVarM9066)) {
                return true;
            }
        } while (lVarM9066 != lVar);
        return false;
    }

    public final String toString() {
        return C0002.m1327(C0009.m2037(m2681(), 0, 3, 655), new Object[]{m2680(this)});
    }
}