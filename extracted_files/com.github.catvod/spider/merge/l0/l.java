package com.github.catvod.spider.merge.l0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f837short = {1444, 1416, 1418, 1418, 1426, 1417, 1422, 1412, 1414, 1427, 1422, 1416, 1417, 1479, 1424, 1422, 1427, 1423, 1479, 1427, 1423, 1410, 1479, 1412, 1419, 1422, 1410, 1417, 1427, 1479, 1413, 1429, 1416, 1420, 1410, 1417};
    public IOException b;
    public final /* synthetic */ m d;
    public boolean c = false;
    public final int a = 5000;

    public l(m mVar) {
        this.d = mVar;
    }

    /* renamed from: ۟ۡ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static short[] m8850() {
        if (C0020.m4210() < 0) {
            return f837short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InetSocketAddress inetSocketAddress;
        try {
            ServerSocket serverSocketM1952 = C0008.m1952(C0028.m5139(this));
            if (C0004.m1573(C0028.m5139(this)) != null) {
                m mVarM5139 = C0028.m5139(this);
                inetSocketAddress = new InetSocketAddress(C0004.m1573(mVarM5139), C0018.m3942(mVarM5139));
            } else {
                inetSocketAddress = new InetSocketAddress(C0018.m3942(C0028.m5139(this)));
            }
            C0047.m7811(serverSocketM1952, inetSocketAddress);
            this.c = true;
            do {
                try {
                    Socket socketM2783 = C0011.m2783(C0008.m1952(C0028.m5139(this)));
                    int iM2788 = C0011.m2788(this);
                    if (iM2788 > 0) {
                        C0004.m1523(socketM2783, iM2788);
                    }
                    InputStream inputStreamM4993 = C0027.m4993(socketM2783);
                    m mVarM51392 = C0028.m5139(this);
                    d dVarM9806 = C0065.m9806(mVarM51392);
                    C0047.m7777(mVarM51392);
                    C0027.m5083(dVarM9806, new a(mVarM51392, inputStreamM4993, socketM2783));
                } catch (IOException e) {
                    C0006.m1730(C0013.m3148(), C0002.m1277(), C0044.m7509(m8850(), 0, 36, 1511), e);
                }
            } while (!C0062.m9395(C0008.m1952(C0028.m5139(this))));
        } catch (IOException e2) {
            this.b = e2;
        }
    }
}