package com.github.catvod.spider.p000mergexbpq.k;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class i extends SSLSocketFactory {
    static String[] b;
    static String[] c;
    public static final X509TrustManager d;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f360short = {3223, 3223, 3208, 604, 580, 603, 599, 602, 603, 585, 599, 607, 577, 604, 576, 599, 585, 589, 603, 599, 570, 573, 574, 599, 591, 587, 581, 599, 603, 576, 585, 571, 560, 572, 3061, 3053, 3058, 3070, 3059, 3058, 3040, 3070, 3062, 3048, 3061, 3049, 3070, 3040, 3044, 3058, 3070, 2960, 2963, 2969, 3070, 3046, 3042, 3052, 3070, 3058, 3049, 3040, 2963, 2964, 2967, 3275, 3283, 3276, 3264, 3290, 3292, 3291, 3287, 3290, 3264, 3290, 3292, 3291, 3276, 3294, 3264, 3272, 3286, 3275, 3287, 3264, 3294, 3290, 3276, 3264, 3246, 3245, 3239, 3264, 3292, 3293, 3292, 3264, 3276, 3287, 3294, 3245, 3242, 3241, 1909, 1901, 1906, 1918, 1892, 1890, 1893, 1897, 1892, 1918, 1892, 1890, 1893, 1906, 1888, 1918, 1910, 1896, 1909, 1897, 1918, 1888, 1892, 1906, 1918, 1808, 1811, 1817, 1918, 1894, 1890, 1900, 1918, 1906, 1897, 1888, 1811, 1812, 1815, 1204, 1196, 1203, 1215, 1189, 1187, 1188, 1192, 1189, 1215, 1189, 1187, 1188, 1203, 1185, 1215, 1207, 1193, 1204, 1192, 1215, 1185, 1189, 1203, 1215, 1234, 1237, 1238, 1215, 1191, 1187, 1197, 1215, 1203, 1192, 1185, 1235, 1240, 1236, 267, 275, 268, 256, 282, 284, 283, 279, 282, 256, 269, 268, 286, 256, 264, 278, 267, 279, 256, 286, 282, 268, 256, 366, 365, 359, 256, 284, 285, 284, 256, 268, 279, 286, 365, 362, 361, 3022, 3030, 3017, 3013, 3039, 3033, 3026, 3038, 3039, 3013, 3016, 3017, 3035, 3013, 3021, 3027, 3022, 3026, 3013, 3035, 3039, 3017, 3013, 2987, 2984, 2978, 3013, 3037, 3033, 3031, 3013, 3017, 3026, 3035, 2984, 2991, 2988, 668, 644, 667, 663, 666, 667, 649, 663, 671, 641, 668, 640, 663, 763, 652, 653, 667, 663, 653, 652, 653, 663, 651, 650, 651, 663, 667, 640, 649, 1355, 1363, 1356, 1344, 1357, 1356, 1374, 1344, 1352, 1366, 1355, 1367, 1344, 1374, 1370, 1356, 1344, 1326, 1325, 1319, 1344, 1372, 1373, 1372, 1344, 1356, 1367, 1374, 1022, 998, 1017, 1013, 1016, 1017, 1003, 1013, 1021, 995, 1022, 994, 1013, 1003, 1007, 1017, 1013, 920, 927, 924, 1013, 1001, 1000, 1001, 1013, 1017, 994, 1003, 1500, 1476, 1499, 1495, 1485, 1483, 1484, 1472, 1485, 1495, 1485, 1483, 1484, 1499, 1481, 1495, 1503, 1473, 1500, 1472, 1495, 1467, 1484, 1485, 1499, 1495, 1485, 1484, 1485, 1495, 1483, 1482, 1483, 1495, 1499, 1472, 1481, 520, 528, 527, 515, 537, 543, 536, 532, 537, 515, 537, 543, 536, 527, 541, 515, 523, 533, 520, 532, 515, 541, 537, 527, 515, 621, 622, 612, 515, 543, 542, 543, 515, 527, 532, 541, 1631, 1607, 1624, 1620, 1614, 1608, 1615, 1603, 1614, 1620, 1625, 1624, 1610, 1620, 1628, 1602, 1631, 1603, 1620, 1592, 1615, 1614, 1624, 1620, 1614, 1615, 1614, 1620, 1608, 1609, 1608, 1620, 1624, 1603, 1610, 1410, 1434, 1413, 1417, 1427, 1429, 1426, 1438, 1427, 1417, 1412, 1413, 1431, 1417, 1409, 1439, 1410, 1438, 1417, 1431, 1427, 1413, 1417, 1511, 1508, 1518, 1417, 1429, 1428, 1429, 1417, 1413, 1438, 1431, 2820, 2844, 2819};
    private final SSLSocketFactory a;

    static {
        try {
            SSLSocket sSLSocket = (SSLSocket) C0029.m5221(C0027.m5066());
            if (sSLSocket != null) {
                LinkedList linkedList = new LinkedList();
                for (String str : C0016.m3546(sSLSocket)) {
                    if (!C0058.m9127(C0060.m9284(str), C0032.m5708(m3251(), 0, 3, 3268))) {
                        C0031.m5644(linkedList, str);
                    }
                }
                b = (String[]) C0027.m5019(linkedList, new String[C0036.m6191(linkedList)]);
                if (C0054.m8632() < 21) {
                    List listM1203 = C0001.m1203(new String[]{C0030.m5362(m3251(), 3, 31, 520), C0008.m1970(m3251(), 34, 31, 2977), C0063.m9585(m3251(), 65, 39, 3231), C0020.m4199(m3251(), 104, 39, 1825), C0027.m5062(m3251(), 143, 39, 1248), C0028.m5109(m3251(), 182, 37, 351), C0042.m7151(m3251(), 219, 37, 2970), C0057.m8978(m3251(), 256, 29, 712), C0008.m1970(m3251(), 285, 28, 1311), C0012.m2973(m3251(), 313, 28, 938), C0006.m1774(m3251(), 341, 37, 1416), C0046.m7718(m3251(), 378, 36, 604), C0065.m9775(m3251(), 414, 35, 1547), C0023.m4536(m3251(), 449, 34, 1494)});
                    List listM12032 = C0001.m1203(C0052.m8375(sSLSocket));
                    HashSet hashSet = new HashSet(listM1203);
                    C0052.m8385(hashSet, listM12032);
                    C0002.m1243(hashSet, new HashSet(C0001.m1203(C0014.m3290(sSLSocket))));
                    c = (String[]) C0004.m1580(hashSet, new String[C0024.m4751(hashSet)]);
                }
            }
            d = new h();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public i(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextM5597 = C0031.m5597(C0019.m4107(m3251(), 483, 3, 2896));
            C0044.m7499(sSLContextM5597, null, x509TrustManager != null ? new X509TrustManager[]{x509TrustManager} : null, null);
            this.a = C0040.m6643(sSLContextM5597);
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    private void a(SSLSocket sSLSocket) {
        String[] strArrM3250;
        String[] strArrM3253 = m3253();
        if (strArrM3253 != null) {
            C0000.m1069(sSLSocket, strArrM3253);
        }
        if (C0054.m8632() >= 21 || (strArrM3250 = m3250()) == null) {
            return;
        }
        C0017.m3682(sSLSocket, strArrM3250);
    }

    /* renamed from: ۣ۟۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static SSLSocketFactory m3249(Object obj) {
        if (C0041.m6823() < 0) {
            return ((i) obj).a;
        }
        return null;
    }

    /* renamed from: ۟۠ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static String[] m3250() {
        if (C0022.m4497() > 0) {
            return c;
        }
        return null;
    }

    /* renamed from: ۟ۤۥۣۡ, reason: not valid java name and contains not printable characters */
    public static short[] m3251() {
        if (C0041.m6823() <= 0) {
            return f360short;
        }
        return null;
    }

    /* renamed from: ۟ۦۥۣۧ, reason: not valid java name and contains not printable characters */
    public static void m3252(Object obj, Object obj2) {
        if (C0005.m1599() <= 0) {
            ((i) obj).a((SSLSocket) obj2);
        }
    }

    /* renamed from: ۠ۦۨۧ, reason: not valid java name and contains not printable characters */
    public static String[] m3253() {
        if (C0030.m5375() > 0) {
            return b;
        }
        return null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket socketM5574 = C0031.m5574(m3249(this), str, i);
        if (socketM5574 instanceof SSLSocket) {
            m3252(this, (SSLSocket) socketM5574);
        }
        return socketM5574;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket socketM6482 = C0039.m6482(m3249(this), str, i, inetAddress, i2);
        if (socketM6482 instanceof SSLSocket) {
            m3252(this, (SSLSocket) socketM6482);
        }
        return socketM6482;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket socketM4420 = C0022.m4420(m3249(this), inetAddress, i);
        if (socketM4420 instanceof SSLSocket) {
            m3252(this, (SSLSocket) socketM4420);
        }
        return socketM4420;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket socketM6232 = C0036.m6232(m3249(this), inetAddress, i, inetAddress2, i2);
        if (socketM6232 instanceof SSLSocket) {
            m3252(this, (SSLSocket) socketM6232);
        }
        return socketM6232;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket socketM1746 = C0006.m1746(m3249(this), socket, str, i, z);
        if (socketM1746 instanceof SSLSocket) {
            m3252(this, (SSLSocket) socketM1746);
        }
        return socketM1746;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return m3250();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return m3250();
    }
}