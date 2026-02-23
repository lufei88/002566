package com.github.catvod.spider.merge.l0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0302e;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class m {
    public static final Logger h;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f838short = {820, 839, 828, 864, 789, 833, 822, 863, 883, 882, 872, 889, 882, 872, 817, 856, 885, 879, 876, 883, 879, 885, 872, 885, 883, 882, 839, 828, 864, 789, 833, 822, 806, 821, 820, 818, 822, 821, 1405, 1294, 1397, 1321, 1372, 1288, 1407, 1334, 1338, 1339, 1313, 1328, 1339, 1313, 1400, 1313, 1324, 1317, 1328, 1294, 1397, 1321, 1372, 1288, 1407, 1391, 1404, 1405, 1403, 1407, 1404, 669, 742, 698, 719, 667, 748, 750, 669, 679, 747, 700, 647, 747, 668, 667, 748, 751, 669, 742, 698, 719, 667, 748, 763, 669, 742, 698, 719, 667, 748, 669, 737, 698, 740, 667, 750, 669, 664, 740, 664, 737, 667, 748, 751, 669, 737, 698, 740, 667, 2451, 2450, 2432, 2558, 1857, 1898, 1895, 1899, 1888, 1901, 1898, 1891, 1828, 1898, 1899, 1904, 1828, 1911, 1905, 1908, 1908, 1899, 1910, 1904, 1889, 1888, 1832, 1828, 1901, 1891, 1898, 1899, 1910, 1889, 1888, 2281, 2290, 2225, 2234, 2227, 2208, 2209, 2231, 2214, 2287, 2183, 2182, 2196, 2303, 2282, 1087, 1081, 1095, 1067, 1081, 1065, 1059, 1059, 1043, 1048, 1045, 1049, 1042, 1055, 1048, 1041, 1110, 1030, 1028, 1049, 1044, 1050, 1043, 1051, 1114, 1110, 1028, 1043, 1029, 1030, 1049, 1048, 1042, 1055, 1048, 1041, 1110, 1048, 1049, 1026, 1054, 1055, 1048, 1041, 2035, 1992, 1997, 1992, 1993, 2001, 1992, 1926, 1993, 1988, 1996, 1987, 1989, 2002, 1926, 2002, 1993, 1926, 1989, 1994, 1993, 2005, 1987, 678, 650, 656, 649, 641, 709, 651, 650, 657, 709, 646, 649, 650, 662, 640, 1351, 1366, 1355, 1351, 1308, 1904, 1845, 1836, 1840, 1841};
    public volatile ServerSocket c;
    public final C0302e d;
    public Thread e;
    public final C0302e g;
    public final String a = null;
    public final int b = 9997;
    public final d f = new d();

    static {
        C0026.m4930(C0040.m6584(m8851(), 0, 38, 796), 2);
        C0026.m4930(C0054.m8574(m8851(), 38, 31, 1365), 2);
        C0005.m1602(C0013.m3106(m8851(), 69, 49, 710));
        h = C0007.m1811(C0013.m3085(m.class));
    }

    public m() {
        boolean z = false;
        this.d = new C0302e(z);
        this.g = new C0302e(z);
    }

    public static String b(String str) {
        try {
            return C0027.m5053(str, C0011.m2805(m8851(), 118, 4, 2502));
        } catch (UnsupportedEncodingException e) {
            C0006.m1730(C0013.m3148(), C0013.m3150(), C0063.m9585(m8851(), 122, 31, 1796), e);
            return null;
        }
    }

    public static j c(i iVar, String str, String str2) {
        byte[] bArrM4347;
        String strM4199 = C0020.m4199(m8851(), 153, 15, 2258);
        b bVar = new b(str);
        if (str2 == null) {
            return new j(iVar, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        String strM5062 = C0027.m5062(m8851(), 168, 8, 1130);
        String strM1361 = C0003.m1361(bVar);
        try {
            if (!C0010.m2294(C0030.m5383(C0055.m8706(strM1361 == null ? strM5062 : strM1361)), str2) && strM1361 == null) {
                bVar = new b(C0050.m8125(str, strM4199));
            }
            String strM13612 = C0003.m1361(bVar);
            if (strM13612 != null) {
                strM5062 = strM13612;
            }
            bArrM4347 = C0021.m4347(str2, strM5062);
        } catch (UnsupportedEncodingException e) {
            C0006.m1730(C0013.m3148(), C0010.m2304(), C0042.m7151(m8851(), 176, 36, 1142), e);
            bArrM4347 = new byte[0];
        }
        return new j(iVar, C0039.m6549(bVar), new ByteArrayInputStream(bArrM4347), bArrM4347.length);
    }

    public static final void d(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    C0017.m3720((Closeable) obj);
                } else if (obj instanceof Socket) {
                    C0035.m6096((Socket) obj);
                } else {
                    if (!(obj instanceof ServerSocket)) {
                        throw new IllegalArgumentException(C0024.m4740(m8851(), 212, 23, 1958));
                    }
                    C0023.m4610((ServerSocket) obj);
                }
            } catch (IOException e) {
                C0006.m1730(C0013.m3148(), C0010.m2304(), C0021.m4340(m8851(), 235, 15, 741), e);
            }
        }
    }

    public static boolean f(j jVar) {
        String strM4777 = C0025.m4777(jVar);
        return strM4777 != null && (C0058.m9127(C0023.m4587(strM4777), C0043.m7290(m8851(), 250, 5, 1331)) || C0058.m9127(C0023.m4587(C0025.m4777(jVar)), C0050.m8131(m8851(), 255, 5, 1887)));
    }

    /* renamed from: ۟ۢۨۨ۠, reason: not valid java name and contains not printable characters */
    public static short[] m8851() {
        if (C0012.m3024() >= 0) {
            return f838short;
        }
        return null;
    }

    public abstract j e(e eVar);
}