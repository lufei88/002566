package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Inflater;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public final class h implements Callable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f517short = {2980, 2977, 2977, 2966, 2992, 2997, 2997, 2999, 2976, 2998, 2998, 2976, 2977, 17444, 22654, 26808, -32109, 21981, 21735, 2789, 2815, 27265, 23889, 24436, 25714, 26559, -630, 20816, 28430, 19581, 20519, 700, 678, 24681, 22457, 21916, 28314, 27991, -2206, 17987, 28099, 18069, 23247, 2132, 2126, 27259, 23979, 24462, 25736, 26437, -656, 19537, 26577, 19591, 20701, 582, 604, 28153, 23081, 22540, 25354, 24775, -1294, 22056, 26742, 19205, 22367, 1476, 1502};
    public final /* synthetic */ int a = 1;
    public final String b;
    public final String c;
    public final Object d;

    public h(k kVar, String str, String str2) {
        this.d = kVar;
        this.b = str;
        this.c = str2;
    }

    public h(String str, AtomicReference atomicReference, String str2) {
        this.b = str;
        this.d = atomicReference;
        this.c = str2;
    }

    /* renamed from: ۣۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static byte[] m5465(Object obj) {
        if (C0042.m7147() <= 0) {
            return ((ResponseBody) obj).bytes();
        }
        return null;
    }

    /* renamed from: ۟ۤۦۥ۟, reason: not valid java name and contains not printable characters */
    public static ResponseBody m5466(Object obj) {
        if (C0044.m7508() < 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۠ۨۢۨ, reason: not valid java name and contains not printable characters */
    public static Response m5467(Object obj) {
        if (C0057.m9017() > 0) {
            return com.github.catvod.spider.merge.Z.c.f((String) obj);
        }
        return null;
    }

    /* renamed from: ۤۢۧۦ, reason: not valid java name and contains not printable characters */
    public static short[] m5468() {
        if (C0043.m7332() > 0) {
            return f517short;
        }
        return null;
    }

    /* renamed from: ۦۢۡ, reason: contains not printable characters */
    public static void m5469(Object obj) {
        if (C0011.m2755() >= 0) {
            ((ResponseBody) obj).close();
        }
    }

    public String a(String str) {
        ResponseBody responseBodyM5466 = m5466(m5467(str));
        String strM1840 = C0007.m1840();
        if (responseBodyM5466 == null) {
            if (responseBodyM5466 != null) {
                m5469(responseBodyM5466);
            }
            return strM1840;
        }
        try {
            byte[] bArrM5465 = m5465(responseBodyM5466);
            if (bArrM5465.length <= 1) {
                m5469(responseBodyM5466);
                return strM1840;
            }
            Inflater inflater = (Inflater) C0017.m3710(C0038.m6410((k) C0014.m3307(this)));
            C0052.m8306(inflater);
            C0050.m8099(inflater, bArrM5465);
            int length = bArrM5465.length * 4;
            byte[] bArr = new byte[length];
            int i = 0;
            while (true) {
                int iM9279 = C0060.m9279(inflater, bArr, i, length - i);
                if (iM9279 <= 0) {
                    byte[] bArr2 = new byte[i];
                    C0062.m9384(bArr, 0, bArr2, 0, i);
                    String str2 = new String(bArr2);
                    m5469(responseBodyM5466);
                    return str2;
                }
                i += iM9279;
                if (i == length) {
                    length *= 2;
                    byte[] bArr3 = new byte[length];
                    C0062.m9384(bArr, 0, bArr3, 0, i);
                    bArr = bArr3;
                }
            }
        } catch (Throwable th) {
            try {
                m5469(responseBodyM5466);
            } catch (Throwable th2) {
                try {
                    C0052.m8352(C0057.m8970(Throwable.class, C0047.m7833(m5468(), 0, 13, 3013), new Class[]{Throwable.class}), th, new Object[]{th2});
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac A[Catch: all -> 0x00a4, Exception -> 0x00a6, TRY_LEAVE, TryCatch #3 {Exception -> 0x00a6, blocks: (B:6:0x0053, B:10:0x0066, B:13:0x0077, B:15:0x0089, B:21:0x00a8, B:22:0x00ac), top: B:68:0x0053, outer: #2 }] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.U.h.call():java.lang.Object");
    }
}