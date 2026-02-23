package com.github.catvod.spider.merge.l0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class j implements Closeable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f836short = {836, 862, 1692, 1691, 1769, 1765, 1764, 1764, 1775, 1769, 1790, 1763, 1765, 1764, 282, 277, 278, 266, 284, 2165, 2076, 2064, 2132, 2064, 2173, 2173, 2173, 2064, 2121, 2121, 2121, 2121, 2064, 2168, 2168, 2058, 2141, 2141, 2058, 2115, 2115, 2064, 2071, 2167, 2173, 2148, 2071, 1349, 1359, 1366, 315, 317, 323, 303, 317, 301, 295, 295, 1930, 1942, 1942, 1938, 2029, 2035, 2028, 2035, 2018, 975, 1006, 963, 964, 3303, 3275, 3274, 3280, 3265, 3274, 3280, 3209, 3312, 3293, 3284, 3265, 1541, 1536, 1557, 1540, 3111, 3074, 3095, 3078, 1352, 1348, 1349, 1349, 1358, 1352, 1375, 1346, 1348, 1349, 2528, 2508, 2509, 2509, 2502, 2496, 2519, 2506, 2508, 2509, 2597, 2603, 2603, 2622, 2659, 2607, 2594, 2599, 2616, 2603, 1620, 1627, 1624, 1604, 1618, 2654, 2642, 2643, 2633, 2648, 2643, 2633, 2576, 2641, 2648, 2643, 2650, 2633, 2645, 2532, 2504, 2505, 2515, 2498, 2505, 2515, 2442, 2530, 2505, 2500, 2504, 2499, 2510, 2505, 2496, 1017, 996, 1015, 1006, 1111, 1137, 1122, 1133, 1136, 1125, 1126, 1137, 1070, 1094, 1133, 1120, 1132, 1127, 1130, 1133, 1124, 657, 666, 647, 668, 665, 663, 662, 3204, 3203, 283, 269, 262, 268, 314, 269, 283, 280, 263, 262, 283, 269, 320, 321, 338, 328, 315, 284, 265, 284, 285, 283, 328, 267, 265, 262, 335, 284, 328, 266, 269, 328, 262, 285, 260, 260, 326, 2979, 2959, 2965, 2956, 2948, 3008, 2958, 2959, 2964, 3008, 2963, 2949, 2958, 2948, 3008, 2962, 2949, 2963, 2960, 2959, 2958, 2963, 2949, 3008, 2964, 2959, 3008, 2964, 2952, 2949, 3008, 2947, 2956, 2953, 2949, 2958, 2964, 1015, 1019, 1018, 992, 1009, 1018, 992, 953, 1016, 1009, 1018, 1011, 992, 1020, 1108, 1112, 1113, 1091, 1106, 1113, 1091, 1050, 1115, 1106, 1113, 1104, 1091, 1119, 1047, 1088, 1110, 1092, 1047, 1113, 1112, 1047, 1113, 1090, 1114, 1109, 1106, 1093, 1047, 616, 580, 581, 607, 590, 581, 607, 518, 615, 590, 581, 588, 607, 579, 529, 523, 504, 511};
    public final i a;
    public final String b;
    public final InputStream c;
    public final long d;
    public final g e = new g(this);
    public final HashMap f = new HashMap();
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;

    public j(i iVar, String str, InputStream inputStream, long j) {
        this.a = iVar;
        this.b = str;
        if (inputStream == null) {
            this.c = new ByteArrayInputStream(new byte[0]);
            this.d = 0L;
        } else {
            this.c = inputStream;
            this.d = j;
        }
        this.h = C0028.m5151(this) < 0;
        this.j = true;
    }

    public static void c(PrintWriter printWriter, String str, String str2) {
        C0004.m1570(C0004.m1570(C0004.m1570(C0004.m1570(printWriter, str), C0041.m6779(m8849(), 0, 2, 894)), str2), C0058.m9106(m8849(), 2, 2, 1681));
    }

    /* renamed from: ۟ۤۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m8849() {
        if (C0015.m3433() >= 0) {
            return f836short;
        }
        return null;
    }

    public final String a(String str) {
        return (String) C0065.m9715(C0012.m2951(this), C0023.m4587(str));
    }

    public final boolean b() {
        return C0007.m1815(C0007.m1842(m8849(), 14, 5, 377), C0025.m4832(this, C0060.m9352(m8849(), 4, 10, 1674)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStreamM6160 = C0035.m6160(this);
        if (inputStreamM6160 != null) {
            C0008.m1955(inputStreamM6160);
        }
    }

    public final void d(OutputStream outputStream) {
        String strM4777 = C0025.m4777(this);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0010.m2300(m8849(), 19, 28, 2096), C0025.m4785());
        C0010.m2316(simpleDateFormat, C0005.m1658(C0012.m2973(m8849(), 47, 3, 1282)));
        i iVarM1209 = C0001.m1209(this);
        try {
            if (iVarM1209 == null) {
                throw new Error(C0028.m5109(m8849(), 186, 37, 360));
            }
            String strM1361 = C0003.m1361(new b(strM4777));
            if (strM1361 == null) {
                strM1361 = C0042.m7151(m8849(), 50, 8, 366);
            }
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, strM1361)), false);
            PrintWriter printWriterM1570 = C0004.m1570(printWriter, C0012.m2973(m8849(), 58, 9, 1986));
            StringBuilder sb = new StringBuilder(C0007.m1840());
            C0036.m6177(sb, C0038.m6407(iVarM1209));
            C0018.m3933(sb, C0018.m3917(m8849(), 67, 1, 1007));
            C0018.m3933(sb, C0055.m8755(iVarM1209));
            C0004.m1570(C0004.m1570(printWriterM1570, C0047.m7763(sb)), C0000.m1077(m8849(), 68, 3, 974));
            if (strM4777 != null) {
                C0052.m8341(printWriter, C0036.m6188(m8849(), 71, 12, 3236), strM4777);
            }
            if (C0025.m4832(this, C0063.m9585(m8849(), 83, 4, 1633)) == null) {
                C0052.m8341(printWriter, C0058.m9106(m8849(), 87, 4, 3171), C0005.m1647(simpleDateFormat, new Date()));
            }
            Iterator itM5199 = C0029.m5199(C0043.m7267(C0040.m6673(this)));
            while (C0012.m2962(itM5199)) {
                Map.Entry entry = (Map.Entry) C0048.m7949(itM5199);
                C0052.m8341(printWriter, (String) C0045.m7624(entry), (String) C0039.m6540(entry));
            }
            if (C0025.m4832(this, C0055.m8814(m8849(), 91, 10, 1323)) == null) {
                C0052.m8341(printWriter, C0044.m7509(m8849(), 101, 10, 2467), C0028.m5165(this) ? C0018.m3917(m8849(), 111, 10, 2638) : C0025.m4795(m8849(), 121, 5, 1591));
            }
            if (C0025.m4832(this, C0030.m5362(m8849(), 126, 14, 2621)) != null) {
                this.i = false;
            }
            if (C0010.m2362(this)) {
                C0052.m8341(printWriter, C0020.m4199(m8849(), 140, 16, 2471), C0023.m4536(m8849(), 156, 4, 926));
                this.h = true;
            }
            InputStream inputStreamM6160 = C0035.m6160(this);
            long jM5151 = inputStreamM6160 != null ? C0028.m5151(this) : 0L;
            if (C0062.m9426(this) != 5 && C0042.m7125(this)) {
                C0052.m8341(printWriter, C0062.m9389(m8849(), 160, 17, 1027), C0049.m8007(m8849(), 177, 7, 754));
            } else if (!C0010.m2362(this)) {
                jM5151 = C0016.m3571(this, jM5151, printWriter);
            }
            C0004.m1570(printWriter, C0046.m7718(m8849(), 184, 2, 3209));
            C0037.m6319(printWriter);
            if (C0062.m9426(this) != 5 && C0042.m7125(this)) {
                h hVar = new h(outputStream);
                if (C0010.m2362(this)) {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(hVar);
                    C0031.m5661(this, gZIPOutputStream, -1L);
                    C0007.m1884(gZIPOutputStream);
                } else {
                    C0031.m5661(this, hVar, -1L);
                }
                C0025.m4861(hVar);
            } else if (C0010.m2362(this)) {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                C0031.m5661(this, gZIPOutputStream2, -1L);
                C0007.m1884(gZIPOutputStream2);
            } else {
                C0031.m5661(this, outputStream, jM5151);
            }
            C0065.m9744(outputStream);
            C0023.m4544(inputStreamM6160);
        } catch (IOException e) {
            C0006.m1730(C0013.m3148(), C0010.m2304(), C0030.m5362(m8849(), 223, 37, 3040), e);
        }
    }

    public final void e(OutputStream outputStream, long j) {
        long j2 = j;
        byte[] bArr = new byte[(int) 16384];
        boolean z = j2 == -1;
        while (true) {
            if (j2 <= 0 && !z) {
                return;
            }
            int iM4846 = C0025.m4846(C0035.m6160(this), bArr, 0, (int) (z ? 16384L : C0027.m5037(j2, 16384L)));
            if (iM4846 <= 0) {
                return;
            }
            C0040.m6606(outputStream, bArr, 0, iM4846);
            if (!z) {
                j2 -= iM4846;
            }
        }
    }

    public final long f(long j, PrintWriter printWriter) {
        long jM2023 = j;
        String strM4832 = C0025.m4832(this, C0007.m1842(m8849(), 260, 14, 916));
        if (strM4832 != null) {
            try {
                jM2023 = C0008.m2023(strM4832);
            } catch (NumberFormatException unused) {
                C0050.m8122(C0013.m3148(), C0050.m8125(C0014.m3332(m8849(), 274, 29, 1079), strM4832));
            }
        }
        StringBuilder sb = new StringBuilder(C0041.m6779(m8849(), 303, 16, 555));
        C0058.m9141(sb, jM2023);
        C0018.m3933(sb, C0014.m3332(m8849(), 319, 2, 501));
        C0021.m4302(printWriter, C0047.m7763(sb));
        return jM2023;
    }

    public final void g(boolean z) {
        this.i = z;
    }

    public final void h(boolean z) {
        this.j = z;
    }

    public final void i(int i) {
        this.g = i;
    }
}