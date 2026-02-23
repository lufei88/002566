package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f544short = {1125, 1096, 1093, 1025, 1103, 1102, 1109, 1025, 1095, 1096, 1103, 1093, 1025, 1091, 1088, 1101, 1088, 1103, 1090, 1092, 1093, 1025, 1100, 1088, 1107, 1098, 1092, 1107, 1025, 1088, 1109, 1025, 1030, 2401, 1350, 1050, 1086, 1070, 1086, 1070, 1131, 1061, 1060, 1087, 1131, 1063, 1060, 1061, 1068, 1131, 1070, 1061, 1060, 1086, 1068, 1059, 1131, 1087, 1060, 1131, 1064, 1060, 1061, 1080, 1086, 1062, 1070, 1131, 1080, 1070, 1082, 1086, 1070, 1061, 1064, 1070, 3145, 3181, 3197, 3181, 3197, 3128, 3196, 3185, 3196, 3128, 3190, 3191, 3180, 3128, 3189, 3193, 3180, 3195, 3184, 3128, 3197, 3168, 3176, 3197, 3195, 3180, 3197, 3196, 3128, 3179, 3197, 3177, 3181, 3197, 3190, 3195, 3197};
    public final String a;
    public int b = 0;

    public O(String str) {
        C0065.m9779(str);
        this.a = str;
    }

    public static String m(String str) {
        StringBuilder sbM8572 = C0054.m8572();
        char[] cArrM4078 = C0019.m4078(str);
        int length = cArrM4078.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = cArrM4078[i];
            if (c2 != '\\' || c == '\\') {
                C0062.m9399(sbM8572, c2);
            }
            i++;
            c = c2;
        }
        return C0004.m1543(sbM8572);
    }

    /* renamed from: ۟۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m5508() {
        if (C0013.m3167() > 0) {
            return f544short;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1 A[LOOP:0: B:3:0x000f->B:45:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005f A[EDGE_INSN: B:47:0x005f->B:38:0x005f BREAK  A[LOOP:0: B:3:0x000f->B:45:0x00a1], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(char r63, char r64) {
        /*
            r62 = this;
            r13 = r64
            r12 = r63
            r11 = r62
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
            r7 = 0
            r8 = 0
        Lf:
            boolean r9 = com.github.catvod.spider.merge.S0.C0028.m5184(r11)
            if (r9 == 0) goto L16
            goto L5f
        L16:
            char r9 = com.github.catvod.spider.p000mergexbpq.c0.C0010.m2330(r11)
            r10 = 92
            if (r2 == r10) goto L4a
            r10 = 39
            if (r9 != r10) goto L29
            if (r9 == r12) goto L29
            if (r3 != 0) goto L29
            r4 = r4 ^ 1
            goto L33
        L29:
            r10 = 34
            if (r9 != r10) goto L33
            if (r9 == r12) goto L33
            if (r4 != 0) goto L33
            r3 = r3 ^ 1
        L33:
            if (r4 != 0) goto L5d
            if (r3 != 0) goto L5d
            if (r8 == 0) goto L3a
            goto L5d
        L3a:
            if (r9 != r12) goto L45
            int r7 = r7 + 1
            if (r5 != r0) goto L55
            int r5 = com.github.catvod.spider.merge.V.C0032.m5776(r11)
            goto L55
        L45:
            if (r9 != r13) goto L55
            int r7 = r7 + (-1)
            goto L55
        L4a:
            r10 = 81
            if (r9 != r10) goto L50
            r8 = 1
            goto L55
        L50:
            r10 = 69
            if (r9 != r10) goto L55
            r8 = 0
        L55:
            if (r7 <= 0) goto L5d
            if (r2 == 0) goto L5d
            int r6 = com.github.catvod.spider.merge.V.C0032.m5776(r11)
        L5d:
            if (r7 > 0) goto La1
        L5f:
            if (r6 < 0) goto L6a
            java.lang.String r12 = com.github.catvod.spider.merge.i0.C0055.m8702(r11)
            java.lang.String r12 = com.github.catvod.spider.merge.h.C0054.m8636(r12, r5, r6)
            goto L6e
        L6a:
            java.lang.String r12 = com.github.catvod.spider.p000mergexbpq.a0.C0007.m1840()
        L6e:
            if (r7 > 0) goto L71
            return r12
        L71:
            short[] r34 = m5508()
            r37 = 1057(0x421, float:1.481E-42)
            r35 = 0
            r36 = 33
            java.lang.String r34 = com.github.catvod.spider.p000mergexbpq.Q.C0000.m1077(r34, r35, r36, r37)
            r13 = r34
            short[] r50 = m5508()
            r53 = 2374(0x946, float:3.327E-42)
            r51 = 33
            r52 = 1
            java.lang.String r50 = com.github.catvod.spider.merge.x0.C0063.m9585(r50, r51, r52, r53)
            r0 = r50
            java.lang.String r12 = com.github.catvod.spider.p000mergexbpq.Q.C0000.m1130(r13, r12, r0)
            com.github.catvod.spider.merge.R0.b r13 = new com.github.catvod.spider.merge.R0.b
            r13.<init>(r12)
            throw r13
        La1:
            r2 = r9
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.U0.O.a(char, char):java.lang.String");
    }

    public final String b() {
        String strM6112;
        int iM5776 = C0032.m5776(this);
        String strM8702 = C0055.m8702(this);
        String strM4107 = C0019.m4107(m5508(), 34, 1, 1391);
        int iM5388 = C0030.m5388(strM8702, strM4107, iM5776);
        if (iM5388 != -1) {
            strM6112 = C0054.m8636(strM8702, C0032.m5776(this), iM5388);
            this.b = C0004.m1584(strM6112) + C0032.m5776(this);
        } else {
            strM6112 = C0035.m6112(this);
        }
        C0063.m9504(this, strM4107);
        return strM6112;
    }

    public final char c() {
        int iM5776 = C0032.m5776(this);
        this.b = iM5776 + 1;
        return C0007.m1823(C0055.m8702(this), iM5776);
    }

    public final void d(String str) {
        if (!C0016.m3533(this, str)) {
            throw new IllegalStateException(C0051.m8259(m5508(), 76, 37, 3096));
        }
        int iM1584 = C0004.m1584(str);
        int iM15842 = C0004.m1584(C0055.m8702(this));
        int iM5776 = C0032.m5776(this);
        if (iM1584 > iM15842 - iM5776) {
            throw new IllegalStateException(C0016.m3525(m5508(), 35, 41, 1099));
        }
        this.b = iM5776 + iM1584;
    }

    public final String e() {
        String strM8702;
        int iM5776 = C0032.m5776(this);
        loop0: while (true) {
            boolean zM5184 = C0028.m5184(this);
            strM8702 = C0055.m8702(this);
            if (zM5184) {
                break;
            }
            if (!C0052.m8309(this)) {
                char[] cArr = {'-', '_'};
                if (!C0028.m5184(this)) {
                    for (int i = 0; i < 2; i++) {
                        if (C0007.m1823(strM8702, C0032.m5776(this)) == cArr[i]) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
            this.b = C0032.m5776(this) + 1;
        }
        return C0054.m8636(strM8702, iM5776, C0032.m5776(this));
    }

    public final boolean f() {
        boolean z = false;
        while (!C0028.m5184(this) && C0059.m9245(C0007.m1823(C0055.m8702(this), C0032.m5776(this)))) {
            this.b = C0032.m5776(this) + 1;
            z = true;
        }
        return z;
    }

    public final boolean g() {
        return C0004.m1584(C0055.m8702(this)) - C0032.m5776(this) == 0;
    }

    public final boolean h(String str) {
        if (!C0016.m3533(this, str)) {
            return false;
        }
        this.b = C0004.m1584(str) + C0032.m5776(this);
        return true;
    }

    public final boolean i(String str) {
        return C0062.m9433(C0055.m8702(this), true, C0032.m5776(this), str, 0, C0004.m1584(str));
    }

    public final boolean j(String... strArr) {
        for (String str : strArr) {
            if (C0016.m3533(this, str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        return !C0028.m5184(this) && C0040.m6681(C0007.m1823(C0055.m8702(this), C0032.m5776(this)));
    }

    public final String l() {
        int iM5776 = C0032.m5776(this);
        String strM8702 = C0055.m8702(this);
        String strM8890 = C0056.m8890(strM8702, iM5776);
        this.b = C0004.m1584(strM8702);
        return strM8890;
    }

    public final String toString() {
        return C0056.m8890(C0055.m8702(this), C0032.m5776(this));
    }
}