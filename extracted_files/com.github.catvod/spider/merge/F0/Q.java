package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public abstract class Q {
    public static final C0161s b = new C0161s();
    public final int a;

    public Q(int i) {
        this.a = i;
    }

    public static f0 a(C0144a c0144a, com.github.catvod.spider.merge.E0.p pVar) {
        com.github.catvod.spider.merge.E0.p pVar2 = pVar;
        com.github.catvod.spider.merge.E0.p pVarM3385 = C0014.m3385();
        if (pVar2 == null) {
            pVar2 = pVarM3385;
        }
        com.github.catvod.spider.merge.E0.p pVarM8880 = C0056.m8880(pVar2);
        return (pVarM8880 == null || pVar2 == pVarM3385) ? C0041.m6743() : C0037.m6334(C0023.m4609(c0144a, pVarM8880), C0055.m8704(C0036.m6203((X) C0019.m4126((AbstractC0152i) C0028.m5167(C0039.m6516(c0144a), C0049.m8010(pVar2)), 0))));
    }

    public static Q b(Q q, S s, IdentityHashMap identityHashMap) {
        if (C0065.m9709(q)) {
            return q;
        }
        Q q2 = (Q) C0031.m5650(identityHashMap, q);
        if (q2 != null) {
            return q2;
        }
        Q q3 = (Q) C0065.m9715(C0045.m7599(s), q);
        if (q3 != null) {
            C0013.m3172(identityHashMap, q, q3);
            return q3;
        }
        Q[] qArr = new Q[C0049.m8016(q)];
        boolean z = false;
        for (int i = 0; i < qArr.length; i++) {
            Q qM2771 = C0011.m2771(C0016.m3564(q, i), s, identityHashMap);
            if (z || qM2771 != C0016.m3564(q, i)) {
                if (!z) {
                    qArr = new Q[C0049.m8016(q)];
                    for (int i2 = 0; i2 < C0049.m8016(q); i2++) {
                        qArr[i2] = C0016.m3564(q, i2);
                    }
                    z = true;
                }
                qArr[i] = qM2771;
            }
        }
        C0161s c0161sM6743 = C0041.m6743();
        HashMap mapM7599 = C0045.m7599(s);
        if (!z) {
            if (q != c0161sM6743 && ((Q) C0065.m9715(mapM7599, q)) == null) {
                C0053.m8424(mapM7599, q, q);
            }
            C0013.m3172(identityHashMap, q, q);
            return q;
        }
        Q qM6334 = qArr.length == 0 ? c0161sM6743 : qArr.length == 1 ? C0037.m6334(qArr[0], C0045.m7537(q, 0)) : new C0155l(qArr, C0002.m1328((C0155l) q));
        if (qM6334 != c0161sM6743 && ((Q) C0065.m9715(mapM7599, qM6334)) == null) {
            C0053.m8424(mapM7599, qM6334, qM6334);
        }
        C0013.m3172(identityHashMap, qM6334, qM6334);
        C0013.m3172(identityHashMap, q, qM6334);
        return qM6334;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af A[PHI: r2
  0x00af: PHI (r2v22 com.github.catvod.spider.merge.F0.Q) = (r2v18 com.github.catvod.spider.merge.F0.Q), (r2v24 com.github.catvod.spider.merge.F0.Q) binds: [B:66:0x0100, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.github.catvod.spider.merge.F0.Q g(com.github.catvod.spider.merge.F0.Q r69, com.github.catvod.spider.merge.F0.Q r70, boolean r71, com.github.catvod.spider.merge.F0.C0163u r72) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.F0.Q.g(com.github.catvod.spider.merge.F0.Q, com.github.catvod.spider.merge.F0.Q, boolean, com.github.catvod.spider.merge.F0.u):com.github.catvod.spider.merge.F0.Q");
    }

    public abstract Q c(int i);

    public abstract int d(int i);

    public final boolean e() {
        return C0045.m7537(this, C0049.m8016(this) - 1) == Integer.MAX_VALUE;
    }

    public abstract boolean equals(Object obj);

    public boolean f() {
        return this == C0041.m6743();
    }

    public abstract int h();

    public final int hashCode() {
        return C0000.m1111(this);
    }
}