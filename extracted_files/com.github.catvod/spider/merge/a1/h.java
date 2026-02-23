package com.github.catvod.spider.merge.a1;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f740short = {28536, -26337, 30524, -30280, 21448, 17947, 18025, -28470, -2210, -31835, -26337, 30524, 27204, -30633, 23125, 27440, 1145, 22617, -32232, 25031, 1145, 1058, 1086, 1075, 1083, 1075, 1144, 1086, 1058, 1083, 1082, 1683, 2497, 2500, 2500, 2547, 2517, 2512, 2512, 2514, 2501, 2515, 2515, 2501, 2500, 2346, 2345, 2348, 2357, 2347, 2357, 2347, 2357, 2346, 2337, 2338, 2338, 2338, 2349, 680, 683, 686, 695, 681, 695, 681, 695, 680, 675, 672, 672, 672, 686};

    public static String a() {
        String strM4032 = C0019.m4032();
        if (C0057.m8953(strM4032)) {
            C0001.m1155(C0060.m9300());
            C0038.m6402(C0045.m7657(m7249(), 0, 16, 2130));
        }
        return strM4032;
    }

    public static String b() {
        String strM8477 = C0053.m8477(m7249(), 16, 15, 1110);
        String strM1840 = C0007.m1840();
        try {
            File file = new File(C0049.m7985(), strM8477);
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String strM4438 = C0022.m4438(bufferedReader);
                    if (strM4438 == null) {
                        break;
                    }
                    C0018.m3933(sb, strM4438);
                    C0018.m3933(sb, C0048.m7902(m7249(), 31, 1, 1689));
                } catch (Throwable th) {
                    try {
                        C0057.m8961(bufferedReader);
                    } catch (Throwable th2) {
                        try {
                            C0052.m8352(C0057.m8970(Throwable.class, C0052.m8337(m7249(), 32, 13, 2464), new Class[]{Throwable.class}), th, new Object[]{th2});
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            }
            C0057.m8961(bufferedReader);
            strM1840 = C0047.m7763(sb);
        } catch (IOException | Exception unused2) {
        }
        return C0015.m3446(C0015.m3446(strM1840, C0052.m8337(m7249(), 45, 14, 2331), C0037.m6301(C0035.m6110())), C0004.m1549(m7249(), 59, 14, 665), C0037.m6301(C0035.m6110()));
    }

    /* renamed from: ۟ۥۡۤۧ, reason: not valid java name and contains not printable characters */
    public static short[] m7249() {
        if (C0008.m1975() > 0) {
            return f740short;
        }
        return null;
    }
}