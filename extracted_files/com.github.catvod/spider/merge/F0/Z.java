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
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class Z extends a0 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f423short = {3065, 3065};
    public final d0[] b;

    public Z(d0 d0Var, d0 d0Var2) {
        HashSet hashSet = new HashSet();
        if (d0Var instanceof Z) {
            C0010.m2310(hashSet, C0001.m1203(C0052.m8301((Z) d0Var)));
        } else {
            C0051.m8266(hashSet, d0Var);
        }
        if (d0Var2 instanceof Z) {
            C0010.m2310(hashSet, C0001.m1203(C0052.m8301((Z) d0Var2)));
        } else {
            C0051.m8266(hashSet, d0Var2);
        }
        List listM5667 = C0031.m5667(hashSet);
        if (!C0035.m6132(listM5667)) {
            C0051.m8266(hashSet, (b0) C0050.m8088(listM5667));
        }
        this.b = (d0[]) C0018.m3969(hashSet, new d0[C0024.m4751(hashSet)]);
    }

    /* renamed from: ۤۥۡۦ, reason: not valid java name and contains not printable characters */
    public static short[] m3860() {
        if (C0037.m6350() < 0) {
            return f423short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.d0
    public final boolean c(com.github.catvod.spider.merge.E0.s sVar, com.github.catvod.spider.merge.E0.p pVar) {
        for (d0 d0Var : C0052.m8301(this)) {
            if (C0049.m8054(d0Var, sVar, pVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.F0.d0
    public final d0 d(com.github.catvod.spider.merge.E0.s sVar, com.github.catvod.spider.merge.E0.p pVar) {
        ArrayList arrayList = new ArrayList();
        d0[] d0VarArrM8301 = C0052.m8301(this);
        int length = d0VarArrM8301.length;
        int i = 0;
        boolean z = false;
        while (true) {
            c0 c0VarM9087 = C0058.m9087();
            if (i >= length) {
                if (!z) {
                    return this;
                }
                if (C0007.m1817(arrayList)) {
                    return null;
                }
                d0 d0Var = (d0) C0028.m5167(arrayList, 0);
                for (int i2 = 1; i2 < C0009.m2139(arrayList); i2++) {
                    d0 d0Var2 = (d0) C0028.m5167(arrayList, i2);
                    if (d0Var == null) {
                        d0Var = d0Var2;
                    } else if (d0Var2 != null) {
                        if (d0Var == c0VarM9087 || d0Var2 == c0VarM9087) {
                            d0Var = c0VarM9087;
                        } else {
                            Z z2 = new Z(d0Var, d0Var2);
                            d0[] d0VarArrM83012 = C0052.m8301(z2);
                            d0Var = d0VarArrM83012.length == 1 ? d0VarArrM83012[0] : z2;
                        }
                    }
                }
                return d0Var;
            }
            d0 d0Var3 = d0VarArrM8301[i];
            d0 d0VarM4085 = C0019.m4085(d0Var3, sVar, pVar);
            z |= d0VarM4085 != d0Var3;
            if (d0VarM4085 == c0VarM9087) {
                return c0VarM9087;
            }
            if (d0VarM4085 != null) {
                C0004.m1532(arrayList, d0VarM4085);
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Z) {
            return C0037.m6347(C0052.m8301(this), C0052.m8301((Z) obj));
        }
        return false;
    }

    public final int hashCode() {
        int iM8087 = C0050.m8087(Z.class);
        d0[] d0VarArrM8301 = C0052.m8301(this);
        for (d0 d0Var : d0VarArrM8301) {
            iM8087 = C0031.m5632(iM8087, d0Var);
        }
        return C0043.m7334(iM8087, d0VarArrM8301.length);
    }

    public final String toString() {
        return C0055.m8784(C0013.m3109(C0001.m1203(C0052.m8301(this))), C0064.m9599(m3860(), 0, 2, 2949));
    }
}