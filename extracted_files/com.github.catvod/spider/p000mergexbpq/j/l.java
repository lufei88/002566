package com.github.catvod.spider.p000mergexbpq.j;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0124g;
import com.github.catvod.spider.p000mergexbpq.h0.d;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.github.catvod.spider.p000mergexbpq.x.f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f353short = {2399, 1112, 1105, 1090, 1102, 1116, 1104, 1112, 1090, 1097, 1116, 1114, 1090, 1108, 1107, 1113, 1112, 1093, 1090, 1110, 1112, 1092, 2036, 2047, 2042, 2040, 2035, 1975, 1952, 1952, 1952, 1975};

    public static final Object a(Throwable th) {
        return new f(th);
    }

    public static C0124g b(com.github.catvod.spider.p000mergexbpq.c0.l lVar) {
        com.github.catvod.spider.p000mergexbpq.c0.l lVarM5791 = lVar;
        C0124g c0124g = new C0124g();
        while (true) {
            lVarM5791 = C0033.m5791(lVarM5791);
            if (lVarM5791 == null) {
                break;
            }
            C0018.m3918(c0124g, lVarM5791);
        }
        if (C0009.m2095(c0124g) > 0) {
            return c0124g;
        }
        return null;
    }

    public static int c(com.github.catvod.spider.p000mergexbpq.c0.l lVar, d dVar) {
        Iterator itM7807 = C0047.m7807(C0003.m1401(C0058.m9066(lVar)));
        int i = 1;
        while (C0012.m2962(itM7807)) {
            com.github.catvod.spider.p000mergexbpq.c0.l lVar2 = (com.github.catvod.spider.p000mergexbpq.c0.l) C0048.m7949(itM7807);
            if (C0007.m1815(C0001.m1214(lVar), C0001.m1214(lVar2)) && C0036.m6244(C0051.m8184(dVar), lVar2)) {
                if (lVar == lVar2) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    public static C0124g d(com.github.catvod.spider.p000mergexbpq.c0.l lVar) {
        com.github.catvod.spider.p000mergexbpq.c0.l lVarM2955 = lVar;
        C0124g c0124g = new C0124g();
        while (true) {
            lVarM2955 = C0012.m2955(lVarM2955);
            if (lVarM2955 == null) {
                break;
            }
            C0018.m3918(c0124g, lVarM2955);
        }
        if (C0009.m2095(c0124g) > 0) {
            return c0124g;
        }
        return null;
    }

    public static String e(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String strM4438 = C0022.m4438(bufferedReader);
                if (strM4438 == null) {
                    break;
                }
                C0018.m3933(sb, strM4438);
                C0018.m3933(sb, C0065.m9775(m3071(), 0, 1, 2389));
            }
            C0057.m8961(bufferedReader);
            String strM7763 = C0047.m7763(sb);
            C0008.m2018();
            return (strM7763 == null || C0004.m1584(strM7763) <= 1) ? strM7763 : C0054.m8636(strM7763, 0, C0004.m1584(strM7763) - 1);
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public static void f(com.github.catvod.spider.p000mergexbpq.c0.l lVar, int i) {
        C0035.m6123(lVar, C0054.m8574(m3071(), 1, 21, 1053), C0054.m8599(i));
    }

    public static void g(File file, String str) {
        byte[] bArrM8115 = C0050.m8115(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            C0016.m3527(fileOutputStream, bArrM8115);
            C0065.m9744(fileOutputStream);
            C0023.m4573(fileOutputStream);
            try {
                Runtime runtimeM8355 = C0052.m8355();
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, C0061.m9361(m3071(), 22, 10, 1943));
                C0016.m3605(sb, file);
                C0036.m6197(C0054.m8580(runtimeM8355, C0047.m7763(sb)));
            } catch (Exception e) {
                C0049.m7975(e);
            }
        } catch (Exception e2) {
            C0049.m7975(e2);
        }
    }

    /* renamed from: ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static short[] m3071() {
        if (C0035.m6140() < 0) {
            return f353short;
        }
        return null;
    }
}