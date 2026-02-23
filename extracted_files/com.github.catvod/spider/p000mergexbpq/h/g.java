package com.github.catvod.spider.p000mergexbpq.h;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
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
public final class g extends SSLSocketFactory {
    static String[] c;
    static String[] d;
    private final SSLSocketFactory a;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f349short = {2654, 2654, 2625, 2875, 2851, 2876, 2864, 2877, 2876, 2862, 2864, 2872, 2854, 2875, 2855, 2864, 2862, 2858, 2876, 2864, 2909, 2906, 2905, 2864, 2856, 2860, 2850, 2864, 2876, 2855, 2862, 2908, 2903, 2907, 2924, 2932, 2923, 2919, 2922, 2923, 2937, 2919, 2927, 2929, 2924, 2928, 2919, 2937, 2941, 2923, 2919, 2825, 2826, 2816, 2919, 2943, 2939, 2933, 2919, 2923, 2928, 2937, 2826, 2829, 2830, 1446, 1470, 1441, 1453, 1463, 1457, 1462, 1466, 1463, 1453, 1463, 1457, 1462, 1441, 1459, 1453, 1445, 1467, 1446, 1466, 1453, 1459, 1463, 1441, 1453, 1475, 1472, 1482, 1453, 1457, 1456, 1457, 1453, 1441, 1466, 1459, 1472, 1479, 1476, 1678, 1686, 1673, 1669, 1695, 1689, 1694, 1682, 1695, 1669, 1695, 1689, 1694, 1673, 1691, 1669, 1677, 1683, 1678, 1682, 1669, 1691, 1695, 1673, 1669, 1771, 1768, 1762, 1669, 1693, 1689, 1687, 1669, 1673, 1682, 1691, 1768, 1775, 1772, 1764, 1788, 1763, 1775, 1781, 1779, 1780, 1784, 1781, 1775, 1781, 1779, 1780, 1763, 1777, 1775, 1767, 1785, 1764, 1784, 1775, 1777, 1781, 1763, 1775, 1666, 1669, 1670, 1775, 1783, 1779, 1789, 1775, 1763, 1784, 1777, 1667, 1672, 1668, 2691, 2715, 2692, 2696, 2706, 2708, 2707, 2719, 2706, 2696, 2693, 2692, 2710, 2696, 2688, 2718, 2691, 2719, 2696, 2710, 2706, 2692, 2696, 2790, 2789, 2799, 2696, 2708, 2709, 2708, 2696, 2692, 2719, 2710, 2789, 2786, 2785, 3035, 3011, 3036, 3024, 3018, 3020, 3015, 3019, 3018, 3024, 3037, 3036, 3022, 3024, 3032, 3014, 3035, 3015, 3024, 3022, 3018, 3036, 3024, 3006, 3005, 2999, 3024, 3016, 3020, 3010, 3024, 3036, 3015, 3022, 3005, 3002, 3001, 1339, 1315, 1340, 1328, 1341, 1340, 1326, 1328, 1336, 1318, 1339, 1319, 1328, 1372, 1323, 1322, 1340, 1328, 1322, 1323, 1322, 1328, 1324, 1325, 1324, 1328, 1340, 1319, 1326, 477, 453, 474, 470, 475, 474, 456, 470, 478, 448, 477, 449, 470, 456, 460, 474, 470, 440, 443, 433, 470, 458, 459, 458, 470, 474, 449, 456, 2770, 2762, 2773, 2777, 2772, 2773, 2759, 2777, 2769, 2767, 2770, 2766, 2777, 2759, 2755, 2773, 2777, 2740, 2739, 2736, 2777, 2757, 2756, 2757, 2777, 2773, 2766, 2759, 730, 706, 733, 721, 715, 717, 714, 710, 715, 721, 715, 717, 714, 733, 719, 721, 729, 711, 730, 710, 721, 701, 714, 715, 733, 721, 715, 714, 715, 721, 717, 716, 717, 721, 733, 710, 719, 2305, 2329, 2310, 2314, 2320, 2326, 2321, 2333, 2320, 2314, 2320, 2326, 2321, 2310, 2324, 2314, 2306, 2332, 2305, 2333, 2314, 2324, 2320, 2310, 2314, 2404, 2407, 2413, 2314, 2326, 2327, 2326, 2314, 2310, 2333, 2324, 475, 451, 476, 464, 458, 460, 459, 455, 458, 464, 477, 476, 462, 464, 472, 454, 475, 455, 464, 444, 459, 458, 476, 464, 458, 459, 458, 464, 460, 461, 460, 464, 476, 455, 462, 2679, 2671, 2672, 2684, 2662, 2656, 2663, 2667, 2662, 2684, 2673, 2672, 2658, 2684, 2676, 2666, 2679, 2667, 2684, 2658, 2662, 2672, 2684, 2578, 2577, 2587, 2684, 2656, 2657, 2656, 2684, 2672, 2667, 2658, 1661, 1637, 1658};
    public static final X509TrustManager b = new f();

    static {
        c = null;
        d = null;
        try {
            SSLSocket sSLSocket = (SSLSocket) C0029.m5221(C0027.m5066());
            if (sSLSocket != null) {
                LinkedList linkedList = new LinkedList();
                for (String str : C0016.m3546(sSLSocket)) {
                    if (!C0058.m9127(C0060.m9284(str), C0027.m5062(m2939(), 0, 3, 2573))) {
                        C0031.m5644(linkedList, str);
                    }
                }
                c = (String[]) C0027.m5019(linkedList, new String[C0036.m6191(linkedList)]);
                List listM1203 = C0001.m1203(new String[]{C0008.m1970(m2939(), 3, 31, 2927), C0040.m6584(m2939(), 34, 31, 2872), C0038.m6452(m2939(), 65, 39, 1522), C0016.m3525(m2939(), 104, 39, 1754), C0043.m7290(m2939(), 143, 39, 1712), C0034.m6001(m2939(), 182, 37, 2775), C0027.m5062(m2939(), 219, 37, 2959), C0008.m1970(m2939(), 256, 29, 1391), C0028.m5109(m2939(), 285, 28, 393), C0064.m9599(m2939(), 313, 28, 2694), C0029.m5256(m2939(), 341, 37, 654), C0028.m5109(m2939(), 378, 36, 2389), C0062.m9389(m2939(), 414, 35, 399), C0052.m8337(m2939(), 449, 34, 2595)});
                List listM12032 = C0001.m1203(C0052.m8375(sSLSocket));
                HashSet hashSet = new HashSet(listM1203);
                C0052.m8385(hashSet, listM12032);
                C0002.m1243(hashSet, new HashSet(C0001.m1203(C0014.m3290(sSLSocket))));
                d = (String[]) C0004.m1580(hashSet, new String[C0024.m4751(hashSet)]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public g() {
        try {
            SSLContext sSLContextM5597 = C0031.m5597(C0010.m2300(m2939(), 483, 3, 1577));
            C0044.m7499(sSLContextM5597, null, new X509TrustManager[]{C0042.m7114()}, null);
            SSLSocketFactory sSLSocketFactoryM6643 = C0040.m6643(sSLContextM5597);
            this.a = sSLSocketFactoryM6643;
            C0037.m6368(sSLSocketFactoryM6643);
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    private void a(SSLSocket sSLSocket) {
        String[] strArrM2937 = m2937();
        if (strArrM2937 != null) {
            C0000.m1069(sSLSocket, strArrM2937);
        }
        String[] strArrM2940 = m2940();
        if (strArrM2940 != null) {
            C0017.m3682(sSLSocket, strArrM2940);
        }
    }

    /* renamed from: ۟ۤۤۤۥ, reason: not valid java name and contains not printable characters */
    public static String[] m2937() {
        if (C0064.m9659() < 0) {
            return c;
        }
        return null;
    }

    /* renamed from: ۟ۤۥۣۧ, reason: not valid java name and contains not printable characters */
    public static void m2938(Object obj, Object obj2) {
        if (C0006.m1726() < 0) {
            ((g) obj).a((SSLSocket) obj2);
        }
    }

    /* renamed from: ۟ۥۣۡ۟, reason: not valid java name and contains not printable characters */
    public static short[] m2939() {
        if (C0001.m1164() <= 0) {
            return f349short;
        }
        return null;
    }

    /* renamed from: ۟ۧۦۦۣ, reason: not valid java name and contains not printable characters */
    public static String[] m2940() {
        if (C0005.m1599() <= 0) {
            return d;
        }
        return null;
    }

    /* renamed from: ۡۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static SSLSocketFactory m2941(Object obj) {
        if (C0013.m3167() > 0) {
            return ((g) obj).a;
        }
        return null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket socketM5574 = C0031.m5574(m2941(this), str, i);
        if (socketM5574 instanceof SSLSocket) {
            m2938(this, (SSLSocket) socketM5574);
        }
        return socketM5574;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket socketM6482 = C0039.m6482(m2941(this), str, i, inetAddress, i2);
        if (socketM6482 instanceof SSLSocket) {
            m2938(this, (SSLSocket) socketM6482);
        }
        return socketM6482;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket socketM4420 = C0022.m4420(m2941(this), inetAddress, i);
        if (socketM4420 instanceof SSLSocket) {
            m2938(this, (SSLSocket) socketM4420);
        }
        return socketM4420;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket socketM6232 = C0036.m6232(m2941(this), inetAddress, i, inetAddress2, i2);
        if (socketM6232 instanceof SSLSocket) {
            m2938(this, (SSLSocket) socketM6232);
        }
        return socketM6232;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket socketM1746 = C0006.m1746(m2941(this), socket, str, i, z);
        if (socketM1746 instanceof SSLSocket) {
            m2938(this, (SSLSocket) socketM1746);
        }
        return socketM1746;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return m2940();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return m2940();
    }
}