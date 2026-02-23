package com.github.catvod.spider.merge.U;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f516short = {493, 454, 478, 455, 453, 454, 456, 461, 484, 509, 393, 473, 448, 473, 460, 393, 478, 475, 448, 477, 460, 393, 460, 475, 475, 454, 475, 403, 393, 2089, 2075, 2053, 2085, 2050, 2076, 2102, 2069, 2052, 2067, 2072, 2069, 2050, 30198, 27833, 28179, -25117, -31858, 17672, 28296, 29330, 27613, 26999, -25977, -31510, 17004, 27116};
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* renamed from: ۟۟ۡۡ۟, reason: not valid java name and contains not printable characters */
    public static void m5463(Object obj) {
        if (C0061.m9359() < 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m5464() {
        if (C0043.m7332() > 0) {
            return f516short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrM3002;
        switch (C0003.m1454(this)) {
            case 0:
                i iVar = (i) C0045.m7573(this);
                try {
                    C0044.m7506(iVar, (ArrayList) ((List) C0032.m5728(this)));
                    C0047.m7812(C0012.m2956(iVar), true);
                    C0027.m5072(C0017.m3657(iVar));
                    C0027.m5072(C0007.m1831(iVar));
                    return;
                } catch (InterruptedException unused) {
                    C0034.m6006(C0031.m5631());
                    C0012.m2969(C0035.m6087(), C0031.m5565(m5464(), 49, 7, 3137));
                    return;
                }
            case 1:
                n nVar = (n) C0045.m7573(this);
                try {
                    C0018.m3978(nVar, (ArrayList) ((List) C0032.m5728(this)));
                    C0047.m7812((AtomicBoolean) C0015.m3511(nVar), true);
                    C0027.m5072((ExecutorService) C0063.m9563(nVar));
                    C0027.m5072((ExecutorService) C0012.m3031(nVar));
                    return;
                } catch (InterruptedException unused2) {
                    C0034.m6006(C0031.m5631());
                    C0026.m4951(m5464(), 29, 13, 2160);
                    C0046.m7718(m5464(), 42, 7, 2853);
                    return;
                }
            default:
                com.github.catvod.spider.merge.d0.d dVar = (com.github.catvod.spider.merge.d0.d) C0045.m7573(this);
                Pipe.SinkChannel sinkChannel = (Pipe.SinkChannel) C0032.m5728(this);
                C0047.m7777(dVar);
                long j = 0;
                while (C0035.m6125(dVar) && (bArrM3002 = C0012.m3002(dVar, j)) != null) {
                    try {
                        try {
                            int i = 0;
                            while (i < bArrM3002.length && C0035.m6125(dVar)) {
                                int iM8186 = C0051.m8186(i + 8192, bArrM3002.length);
                                int i2 = iM8186 - i;
                                ByteBuffer byteBufferM1690 = C0006.m1690(bArrM3002, i, i2);
                                while (C0004.m1585(byteBufferM1690) && C0035.m6125(dVar)) {
                                    C0048.m7945(sinkChannel, byteBufferM1690);
                                }
                                dVar.k = C0029.m5293(dVar) + i2;
                                dVar.n = C0009.m2099();
                                i = iM8186;
                            }
                            j++;
                            long jM4243 = C0020.m4243(dVar);
                            if (jM4243 < 0 || j < jM4243) {
                            }
                        } catch (Exception e) {
                            if (C0035.m6125(dVar)) {
                                StringBuilder sb = new StringBuilder();
                                C0018.m3933(sb, C0010.m2300(m5464(), 0, 29, 425));
                                C0018.m3933(sb, C0036.m6261(e));
                                m5463(C0047.m7763(sb));
                            }
                        }
                    } finally {
                        try {
                            C0000.m1053(sinkChannel);
                        } catch (IOException unused3) {
                        }
                        C0022.m4402(dVar);
                    }
                }
                return;
        }
    }
}