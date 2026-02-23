package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class Y extends a0 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f422short = {1160, 1160};
    public final d0[] b;

    public Y(d0 d0Var, d0 d0Var2) {
        HashSet hashSet = new HashSet();
        if (d0Var instanceof Y) {
            C0010.m2310(hashSet, C0001.m1203(C0003.m1468((Y) d0Var)));
        } else {
            C0051.m8266(hashSet, d0Var);
        }
        if (d0Var2 instanceof Y) {
            C0010.m2310(hashSet, C0001.m1203(C0003.m1468((Y) d0Var2)));
        } else {
            C0051.m8266(hashSet, d0Var2);
        }
        List listM5667 = C0031.m5667(hashSet);
        if (!C0035.m6132(listM5667)) {
            C0051.m8266(hashSet, (b0) C0037.m6359(listM5667));
        }
        this.b = (d0[]) C0018.m3969(hashSet, new d0[C0024.m4751(hashSet)]);
    }

    /* renamed from: ۣۢۡ۟, reason: not valid java name and contains not printable characters */
    public static short[] m3859() {
        if (C0009.m2047() > 0) {
            return f422short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.d0
    public final boolean c(com.github.catvod.spider.merge.E0.s sVar, com.github.catvod.spider.merge.E0.p pVar) {
        for (d0 d0Var : C0003.m1468(this)) {
            if (!C0049.m8054(d0Var, sVar, pVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.github.catvod.spider.merge.F0.d0
    public final d0 d(com.github.catvod.spider.merge.E0.s sVar, com.github.catvod.spider.merge.E0.p pVar) {
        ArrayList arrayList = new ArrayList();
        d0[] d0VarArrM1468 = C0003.m1468(this);
        int length = d0VarArrM1468.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            c0 c0VarM9087 = C0058.m9087();
            if (i >= length) {
                if (i2 == 0) {
                    return this;
                }
                if (C0007.m1817(arrayList)) {
                    return c0VarM9087;
                }
                d0 d0VarM9519 = (d0) C0028.m5167(arrayList, 0);
                while (i < C0009.m2139(arrayList)) {
                    d0VarM9519 = C0063.m9519(d0VarM9519, (d0) C0028.m5167(arrayList, i));
                    i++;
                }
                return d0VarM9519;
            }
            d0 d0Var = d0VarArrM1468[i];
            d0 d0VarM4085 = C0019.m4085(d0Var, sVar, pVar);
            i2 |= d0VarM4085 == d0Var ? 0 : 1;
            if (d0VarM4085 == null) {
                return null;
            }
            if (d0VarM4085 != c0VarM9087) {
                C0004.m1532(arrayList, d0VarM4085);
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y) {
            return C0037.m6347(C0003.m1468(this), C0003.m1468((Y) obj));
        }
        return false;
    }

    public final int hashCode() {
        int iM8087 = C0050.m8087(Y.class);
        d0[] d0VarArrM1468 = C0003.m1468(this);
        for (d0 d0Var : d0VarArrM1468) {
            iM8087 = C0031.m5632(iM8087, d0Var);
        }
        return C0043.m7334(iM8087, d0VarArrM1468.length);
    }

    public final String toString() {
        return C0055.m8784(C0013.m3109(C0001.m1203(C0003.m1468(this))), C0004.m1549(m3859(), 0, 2, 1198));
    }
}