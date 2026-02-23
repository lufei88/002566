package com.github.catvod.spider.merge.Z;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class f extends SSLSocketFactory {
    public final SSLSocketFactory a;
    public final String[] b;
    public final String[] c;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f690short = {2432, 2432, 2463, 1915, 1891, 1916, 1904, 1917, 1916, 1902, 1904, 1912, 1894, 1915, 1895, 1904, 1902, 1898, 1916, 1904, 1821, 1818, 1817, 1904, 1896, 1900, 1890, 1904, 1916, 1895, 1902, 1820, 1815, 1819, 1638, 1662, 1633, 1645, 1632, 1633, 1651, 1645, 1637, 1659, 1638, 1658, 1645, 1651, 1655, 1633, 1645, 1539, 1536, 1546, 1645, 1653, 1649, 1663, 1645, 1633, 1658, 1651, 1536, 1543, 1540, 1268, 1260, 1267, 1279, 1253, 1251, 1252, 1256, 1253, 1279, 1253, 1251, 1252, 1267, 1249, 1279, 1271, 1257, 1268, 1256, 1279, 1249, 1253, 1267, 1279, 1169, 1170, 1176, 1279, 1251, 1250, 1251, 1279, 1267, 1256, 1249, 1170, 1173, 1174, 763, 739, 764, 752, 746, 748, 747, 743, 746, 752, 746, 748, 747, 764, 750, 752, 760, 742, 763, 743, 752, 750, 746, 764, 752, 670, 669, 663, 752, 744, 748, 738, 752, 764, 743, 750, 669, 666, 665, 942, 950, 937, 933, 959, 953, 958, 946, 959, 933, 959, 953, 958, 937, 955, 933, 941, 947, 942, 946, 933, 955, 959, 937, 933, 968, 975, 972, 933, 957, 953, 951, 933, 937, 946, 955, 969, 962, 974, 1657, 1633, 1662, 1650, 1640, 1646, 1641, 1637, 1640, 1650, 1663, 1662, 1644, 1650, 1658, 1636, 1657, 1637, 1650, 1644, 1640, 1662, 1650, 1564, 1567, 1557, 1650, 1646, 1647, 1646, 1650, 1662, 1637, 1644, 1567, 1560, 1563, 1143, 1135, 1136, 1148, 1126, 1120, 1131, 1127, 1126, 1148, 1137, 1136, 1122, 1148, 1140, 1130, 1143, 1131, 1148, 1122, 1126, 1136, 1148, 1042, 1041, 1051, 1148, 1124, 1120, 1134, 1148, 1136, 1131, 1122, 1041, 1046, 1045, 2132, 2124, 2131, 2143, 2130, 2131, 2113, 2143, 2135, 2121, 2132, 2120, 2143, 2099, 2116, 2117, 2131, 2143, 2117, 2116, 2117, 2143, 2115, 2114, 2115, 2143, 2131, 2120, 2113, 2927, 2935, 2920, 2916, 2921, 2920, 2938, 2916, 2924, 2930, 2927, 2931, 2916, 2938, 2942, 2920, 2916, 2826, 2825, 2819, 2916, 2936, 2937, 2936, 2916, 2920, 2931, 2938, 2325, 2317, 2322, 2334, 2323, 2322, 2304, 2334, 2326, 2312, 2325, 2313, 2334, 2304, 2308, 2322, 2334, 2419, 2420, 2423, 2334, 2306, 2307, 2306, 2334, 2322, 2313, 2304, 2291, 2283, 2292, 2296, 2274, 2276, 2275, 2287, 2274, 2296, 2274, 2276, 2275, 2292, 2278, 2296, 2288, 2286, 2291, 2287, 2296, 2196, 2275, 2274, 2292, 2296, 2274, 2275, 2274, 2296, 2276, 2277, 2276, 2296, 2292, 2287, 2278, 1729, 1753, 1734, 1738, 1744, 1750, 1745, 1757, 1744, 1738, 1744, 1750, 1745, 1734, 1748, 1738, 1730, 1756, 1729, 1757, 1738, 1748, 1744, 1734, 1738, 1700, 1703, 1709, 1738, 1750, 1751, 1750, 1738, 1734, 1757, 1748, 2498, 2522, 2501, 2505, 2515, 2517, 2514, 2526, 2515, 2505, 2500, 2501, 2519, 2505, 2497, 2527, 2498, 2526, 2505, 2469, 2514, 2515, 2501, 2505, 2515, 2514, 2515, 2505, 2517, 2516, 2517, 2505, 2501, 2526, 2519, 2836, 2828, 2835, 2847, 2821, 2819, 2820, 2824, 2821, 2847, 2834, 2835, 2817, 2847, 2839, 2825, 2836, 2824, 2847, 2817, 2821, 2835, 2847, 2929, 2930, 2936, 2847, 2819, 2818, 2819, 2847, 2835, 2824, 2817, 1958, 1982, 1953};
    public static final e d = new e();

    public f() {
        try {
            LinkedList linkedList = new LinkedList();
            SSLSocket sSLSocket = (SSLSocket) C0029.m5221(C0027.m5066());
            for (String str : C0016.m3546(sSLSocket)) {
                if (!C0058.m9127(C0060.m9284(str), C0026.m4951(m6300(), 0, 3, 2515))) {
                    C0031.m5644(linkedList, str);
                }
            }
            this.c = (String[]) C0027.m5019(linkedList, new String[0]);
            List listM1203 = C0001.m1203(new String[]{C0034.m6001(m6300(), 3, 31, 1839), C0061.m9361(m6300(), 34, 31, 1586), C0061.m9361(m6300(), 65, 39, 1184), C0062.m9389(m6300(), 104, 39, 687), C0056.m8911(m6300(), 143, 39, 1018), C0063.m9585(m6300(), 182, 37, 1581), C0009.m2037(m6300(), 219, 37, 1059), C0051.m8259(m6300(), 256, 29, 2048), C0014.m3332(m6300(), 285, 28, 2875), C0018.m3917(m6300(), 313, 28, 2369), C0065.m9775(m6300(), 341, 37, 2215), C0008.m1970(m6300(), 378, 36, 1685), C0046.m7718(m6300(), 414, 35, 2454), C0053.m8477(m6300(), 449, 34, 2880)});
            List listM12032 = C0001.m1203(C0052.m8375(sSLSocket));
            HashSet hashSet = new HashSet(listM1203);
            C0052.m8385(hashSet, listM12032);
            C0002.m1243(hashSet, new HashSet(C0001.m1203(C0014.m3290(sSLSocket))));
            this.b = (String[]) C0004.m1580(hashSet, new String[0]);
            SSLContext sSLContextM5597 = C0031.m5597(C0055.m8814(m6300(), 483, 3, 2034));
            C0044.m7499(sSLContextM5597, null, new X509TrustManager[]{C0049.m8002()}, null);
            SSLSocketFactory sSLSocketFactoryM6643 = C0040.m6643(sSLContextM5597);
            this.a = sSLSocketFactoryM6643;
            C0037.m6368(sSLSocketFactoryM6643);
        } catch (Exception e) {
            C0049.m7975(e);
        }
    }

    /* renamed from: ۥۡۢۢ, reason: contains not printable characters */
    public static short[] m6300() {
        if (C0043.m7332() > 0) {
            return f690short;
        }
        return null;
    }

    public final void a(SSLSocket sSLSocket) {
        String[] strArrM8620 = C0054.m8620(this);
        if (strArrM8620 != null) {
            C0000.m1069(sSLSocket, strArrM8620);
        }
        String[] strArrM2127 = C0009.m2127(this);
        if (strArrM2127 != null) {
            C0017.m3682(sSLSocket, strArrM2127);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket socketM5574 = C0031.m5574(C0014.m3328(this), str, i);
        if (socketM5574 instanceof SSLSocket) {
            C0049.m8061(this, (SSLSocket) socketM5574);
        }
        return socketM5574;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket socketM6482 = C0039.m6482(C0014.m3328(this), str, i, inetAddress, i2);
        if (socketM6482 instanceof SSLSocket) {
            C0049.m8061(this, (SSLSocket) socketM6482);
        }
        return socketM6482;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket socketM4420 = C0022.m4420(C0014.m3328(this), inetAddress, i);
        if (socketM4420 instanceof SSLSocket) {
            C0049.m8061(this, (SSLSocket) socketM4420);
        }
        return socketM4420;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket socketM6232 = C0036.m6232(C0014.m3328(this), inetAddress, i, inetAddress2, i2);
        if (socketM6232 instanceof SSLSocket) {
            C0049.m8061(this, (SSLSocket) socketM6232);
        }
        return socketM6232;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket socketM1746 = C0006.m1746(C0014.m3328(this), socket, str, i, z);
        if (socketM1746 instanceof SSLSocket) {
            C0049.m8061(this, (SSLSocket) socketM1746);
        }
        return socketM1746;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return C0009.m2127(this);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return C0009.m2127(this);
    }
}