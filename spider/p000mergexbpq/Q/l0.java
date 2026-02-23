package com.github.catvod.spider.p000mergexbpq.Q;

import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.P.B;
import com.github.catvod.spider.p000mergexbpq.P.C;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l0 {
    public static final k0 c = new k0();

    static List a(Collection collection) {
        Iterator itM1943 = C0008.m1943(collection);
        ArrayList arrayList = null;
        while (C0012.m2962(itM1943)) {
            j0 j0Var = (l0) C0048.m7949(itM1943);
            if (j0Var instanceof j0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C0004.m1532(arrayList, j0Var);
                C0005.m1641(itM1943);
            }
        }
        return arrayList == null ? C0008.m1961() : arrayList;
    }

    public static l0 b(l0 l0Var, l0 l0Var2) {
        k0 k0VarM4200;
        if (l0Var == null || l0Var == (k0VarM4200 = C0020.m4200())) {
            return l0Var2;
        }
        if (l0Var2 == null || l0Var2 == k0VarM4200) {
            return l0Var;
        }
        g0 g0Var = new g0(l0Var, l0Var2);
        l0[] l0VarArrM1042 = m1042(g0Var);
        return l0VarArrM1042.length == 1 ? l0VarArrM1042[0] : g0Var;
    }

    public static l0 e(l0 l0Var, l0 l0Var2) {
        if (l0Var == null) {
            return l0Var2;
        }
        if (l0Var2 == null) {
            return l0Var;
        }
        h0 h0VarM4200 = C0020.m4200();
        if (l0Var != h0VarM4200 && l0Var2 != h0VarM4200) {
            h0VarM4200 = new h0(l0Var, l0Var2);
            l0[] l0VarArrM1041 = m1041(h0VarM4200);
            if (l0VarArrM1041.length == 1) {
                return l0VarArrM1041[0];
            }
        }
        return h0VarM4200;
    }

    /* renamed from: ۟ۥۥۢ۟, reason: not valid java name and contains not printable characters */
    public static l0[] m1041(Object obj) {
        if (C0046.m7701() > 0) {
            return ((h0) obj).d;
        }
        return null;
    }

    /* renamed from: ۠۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static l0[] m1042(Object obj) {
        if (C0059.m9257() < 0) {
            return ((g0) obj).d;
        }
        return null;
    }

    public abstract boolean c(B<?, ?> b, C c2);

    public l0 d(B<?, ?> b, C c2) {
        return this;
    }
}