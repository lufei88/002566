package com.github.catvod.spider.merge.l0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0163u;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f828short = {2391, 2424, 2423, 2422, 2385, 2413, 2413, 2409, 2429, 2361, 2378, 2417, 2412, 2413, 2429, 2422, 2414, 2423, 3047, 3019, 3017, 3017, 3025, 3018, 3021, 3015, 3013, 3024, 3021, 3019, 3018, 2948, 3027, 3021, 3024, 3020, 2948, 3024, 3020, 3009, 2948, 3015, 3016, 3021, 3009, 3018, 3024, 2948, 3014, 3030, 3019, 3023, 3009, 3018, 2952, 2948, 3019, 3030, 2948, 3013, 3018, 2948, 3014, 3025, 3011, 2948, 3021, 3018, 2948, 3024, 3020, 3009, 2948, 3020, 3013, 3018, 3008, 3016, 3009, 3030, 2948, 3015, 3019, 3008, 3009};
    public final InputStream a;
    public final Socket b;
    public final /* synthetic */ m c;

    public a(m mVar, InputStream inputStream, Socket socket) {
        this.c = mVar;
        this.a = inputStream;
        this.b = socket;
    }

    /* renamed from: ۡۡۧۧ, reason: not valid java name and contains not printable characters */
    public static short[] m8841() {
        if (C0057.m9017() > 0) {
            return f828short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputStream inputStreamM3017 = C0012.m3017(this);
        m mVarM2823 = C0011.m2823(this);
        Socket socketM1945 = C0008.m1945(this);
        OutputStream outputStreamM2762 = null;
        try {
            try {
                outputStreamM2762 = C0011.m2762(socketM1945);
                C0047.m7777(C0048.m7916(mVarM2823));
                e eVar = new e(C0011.m2823(this), new C0163u(6), C0012.m3017(this), outputStreamM2762, C0055.m8722(socketM1945));
                while (!C0006.m1773(socketM1945)) {
                    C0015.m3509(eVar);
                }
                C0023.m4544(outputStreamM2762);
                C0023.m4544(inputStreamM3017);
                C0023.m4544(socketM1945);
            } catch (Exception e) {
                if ((!(e instanceof SocketException) || !C0007.m1815(C0039.m6551(m8841(), 0, 18, 2329), C0036.m6261(e))) && !(e instanceof SocketTimeoutException)) {
                    C0006.m1730(C0013.m3148(), C0010.m2304(), C0019.m4107(m8841(), 18, 67, 2980), e);
                }
                C0023.m4544(outputStreamM2762);
                C0023.m4544(inputStreamM3017);
                C0023.m4544(socketM1945);
            }
            C0036.m6212(C0018.m3943(C0065.m9806(mVarM2823)), this);
        } catch (Throwable th) {
            C0023.m4544(outputStreamM2762);
            C0023.m4544(inputStreamM3017);
            C0023.m4544(socketM1945);
            C0036.m6212(C0018.m3943(C0065.m9806(mVarM2823)), this);
            throw th;
        }
    }
}