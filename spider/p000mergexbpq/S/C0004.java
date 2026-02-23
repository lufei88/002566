package com.github.catvod.spider.p000mergexbpq.S;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Process;
import android.text.PrecomputedText;
import android.text.TextUtils;
import android.util.AtomicFile;
import android.util.Half;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebBackForwardList;
import androidx.core.widget.ContentLoadingProgressBar;
import com.github.catvod.spider.Cupfox;
import com.github.catvod.spider.HBCupfox;
import com.github.catvod.spider.HBQG;
import com.github.catvod.spider.HBcms10;
import com.github.catvod.spider.HBhaiM;
import com.github.catvod.spider.HBlingDu;
import com.github.catvod.spider.JSDemo;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.merge.B0.a;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.D.f;
import com.github.catvod.spider.merge.E.j;
import com.github.catvod.spider.merge.E0.b;
import com.github.catvod.spider.merge.F.h;
import com.github.catvod.spider.merge.F0.C;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.G0.c;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.g;
import com.github.catvod.spider.merge.T0.o;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.U0.B;
import com.github.catvod.spider.merge.U0.C0213u;
import com.github.catvod.spider.merge.U0.E;
import com.github.catvod.spider.merge.U0.M;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.n;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0253n;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.L;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d.C0269d;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e1.d;
import com.github.catvod.spider.merge.f.AbstractC0296g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.RunnableC0325e;
import com.github.catvod.spider.merge.h0.T;
import com.github.catvod.spider.merge.h0.v;
import com.github.catvod.spider.merge.h0.x;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.x0.C0413c;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.y0.e;
import com.github.catvod.spider.merge.z.RunnableC0418a;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.k;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.p;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.d0.D;
import com.github.catvod.spider.p000mergexbpq.d0.F;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.m;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.whl.quickjs.wrapper.QuickJSContext;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.text.Format;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge-xbpq.S.ۣ۟۠۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0004 {

    /* renamed from: ۣ۟ۤۥۧ, reason: not valid java name and contains not printable characters */
    public static int f163 = 148;

    /* renamed from: ۣ۟۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m1482(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0012.m3024() >= 0) {
            return ((L) obj).c((String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۟۟ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static String[] m1483() {
        if (C0043.m7332() > 0) {
            return E.l;
        }
        return null;
    }

    /* renamed from: ۟۟ۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m1484() {
        if (C0020.m4210() < 0) {
            return Process.myPid();
        }
        return 0;
    }

    /* renamed from: ۣ۟۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static HashMap m1485(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((C0233B) obj).e();
        }
        return null;
    }

    /* renamed from: ۟۠۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static String m1486(Object obj) {
        if (C0060.m9355() > 0) {
            return ((Context) obj).getPackageName();
        }
        return null;
    }

    /* renamed from: ۟۠۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static void m1487(Object obj) {
        if (C0026.m4977() <= 0) {
            ((x) obj).c();
        }
    }

    /* renamed from: ۣ۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m1488(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0055.m8740() >= 0) {
            return a.l((String) obj, (String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* renamed from: ۟۠ۥۥۧ, reason: not valid java name and contains not printable characters */
    public static void m1489(Object obj, Object obj2, Object obj3, boolean z, boolean z2, boolean z3, boolean z4) {
        if (C0003.m1463() <= 0) {
            o.b((Appendable) obj, (String) obj2, (g) obj3, z, z2, z3, z4);
        }
    }

    /* renamed from: ۟۠ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static AlertDialog m1490(Object obj) {
        if (C0007.m1886() > 0) {
            return ((C0254o) obj).e;
        }
        return null;
    }

    /* renamed from: ۟۠ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static String m1491(Object obj) {
        if (C0041.m6823() < 0) {
            return ((URI) obj).getHost();
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static Class m1492() {
        if (C0007.m1886() > 0) {
            return HBQG.d;
        }
        return null;
    }

    /* renamed from: ۟ۡۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1493(Object obj) {
        if (m1557() <= 0) {
            return ((C0413c) obj).c;
        }
        return false;
    }

    /* renamed from: ۟ۡۤۤۥ, reason: not valid java name and contains not printable characters */
    public static String m1494() {
        if (C0021.m4379() > 0) {
            return "-";
        }
        return null;
    }

    /* renamed from: ۟ۡۤۦ۟, reason: not valid java name and contains not printable characters */
    public static r m1495(Object obj) {
        if (C0018.m3956() > 0) {
            return ((r) obj).g();
        }
        return null;
    }

    /* renamed from: ۟ۡۤۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m1496(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((v) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡۥۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1497(Object obj) {
        if (C0024.m4693() < 0) {
            return ((M) obj).i;
        }
        return false;
    }

    /* renamed from: ۟ۡۥۧۥ, reason: not valid java name and contains not printable characters */
    public static int m1498(Object obj) {
        if (C0042.m7147() < 0) {
            return ((c) obj).b;
        }
        return 0;
    }

    /* renamed from: ۟ۡۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m1499(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((b) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static int m1500(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((com.github.catvod.spider.merge.K0.b) obj).f;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static long m1501(int i, Object obj) {
        if (C0051.m8216() < 0) {
            return Color.convert(i, (ColorSpace) obj);
        }
        return 0L;
    }

    /* renamed from: ۟ۢۡۨۧ, reason: not valid java name and contains not printable characters */
    public static PendingIntent m1502(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((Notification.Action) obj).actionIntent;
        }
        return null;
    }

    /* renamed from: ۟ۢۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m1503(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0059.m9257() <= 0) {
            return ((HBcms10) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m1504(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((Cupfox) obj).d();
        }
        return null;
    }

    /* renamed from: ۟ۢۨۨۢ, reason: not valid java name and contains not printable characters */
    public static int m1505(Object obj) {
        if (C0044.m7508() < 0) {
            return ((C) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static String m1506(Object obj, Object obj2) {
        if (C0048.m7971() >= 0) {
            return ((Format) obj).format(obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1507(Object obj) {
        if (C0063.m9589() < 0) {
            return ((e) obj).isInline();
        }
        return false;
    }

    /* renamed from: ۣۣ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static WebBackForwardList m1508() {
        if (C0005.m1599() < 0) {
            return com.github.catvod.spider.merge.W.v.d;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static String m1509() {
        if (C0023.m4566() <= 0) {
            return "\\&剧情.*?其他";
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1510(Object obj) {
        if (C0061.m9359() < 0) {
            return ((C0233B) obj).p;
        }
        return false;
    }

    /* renamed from: ۟ۤ۟۠, reason: not valid java name and contains not printable characters */
    public static String m1511(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((com.github.catvod.spider.merge.I0.c) obj).getText();
        }
        return null;
    }

    /* renamed from: ۟ۤۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static ContentLoadingProgressBar m1512(Object obj) {
        if (C0033.m5872() > 0) {
            return ((RunnableC0418a) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static void m1513(Object obj) {
        if (C0007.m1886() >= 0) {
            f.i((String) obj);
        }
    }

    /* renamed from: ۟ۤۢۦۨ, reason: not valid java name and contains not printable characters */
    public static String m1514(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((com.github.catvod.spider.merge.N0.b) obj).j;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static int m1515() {
        if (C0054.m8557() < 0) {
            return WindowInsets.Type.ime();
        }
        return 0;
    }

    /* renamed from: ۟ۤۦۣ۠, reason: not valid java name and contains not printable characters */
    public static C0335o m1516(Object obj) {
        if (C0000.m1116() < 0) {
            return ((RunnableC0325e) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۤۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.r0.c m1517() {
        if (C0012.m3024() >= 0) {
            return com.github.catvod.spider.merge.r0.c.a;
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1518(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((ListIterator) obj).hasNext();
        }
        return false;
    }

    /* renamed from: ۟ۥ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static List m1519(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((NG.SearchRst) obj).toVodList();
        }
        return null;
    }

    /* renamed from: ۟ۥۡۦۥ, reason: not valid java name and contains not printable characters */
    public static String m1520(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * 10)) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۟ۥۥۥۣ, reason: not valid java name and contains not printable characters */
    public static int m1521(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟ۥۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m1522(Object obj) {
        if (C0023.m4566() <= 0) {
            return com.github.catvod.spider.merge.g0.g.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۡۥۡ, reason: not valid java name and contains not printable characters */
    public static void m1523(Object obj, int i) throws SocketException {
        if (C0061.m9359() <= 0) {
            ((Socket) obj).setSoTimeout(i);
        }
    }

    /* renamed from: ۟ۦۢۨ۟, reason: not valid java name and contains not printable characters */
    public static void m1524(Object obj, Object obj2) {
        if (C0046.m7701() > 0) {
            ((AtomicFile) obj).finishWrite((FileOutputStream) obj2);
        }
    }

    /* renamed from: ۟ۦۥۣ۠, reason: not valid java name and contains not printable characters */
    public static String m1525() {
        if (C0031.m5628() >= 0) {
            return "调试->homeContent出错：";
        }
        return null;
    }

    /* renamed from: ۟ۦۦ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m1526(Object obj) {
        if (C0008.m1975() >= 0) {
            return m.c((String) obj);
        }
        return false;
    }

    /* renamed from: ۟ۦۦ۠۟, reason: not valid java name and contains not printable characters */
    public static int m1527(Object obj) {
        if (C0045.m7538() < 0) {
            return ((com.github.catvod.spider.merge.B.b) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۦۦۨۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1528(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.f) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۧۧۢۥ, reason: not valid java name and contains not printable characters */
    public static void m1529(Object obj, int i) throws IOException {
        if (C0034.m6048() < 0) {
            ((Reader) obj).mark(i);
        }
    }

    /* renamed from: ۟ۨۢۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m1530(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((ByteBuffer) obj).array();
        }
        return null;
    }

    /* renamed from: ۠ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m1531(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0064.m9659() <= 0) {
            ((PrecomputedText) obj).setSpan(obj2, i, i2, i3);
        }
    }

    /* renamed from: ۠ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1532(Object obj, Object obj2) {
        if (C0018.m3956() > 0) {
            return ((ArrayList) obj).add(obj2);
        }
        return false;
    }

    /* renamed from: ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static QuickJSContext m1533(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((JSDemo) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static String m1534(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((HBCupfox) obj).a;
        }
        return null;
    }

    /* renamed from: ۠ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1535(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((D) obj).d();
        }
        return false;
    }

    /* renamed from: ۠ۦۦ۟, reason: not valid java name and contains not printable characters */
    public static void m1536(Object obj, Object obj2) {
        if (C0058.m9131() < 0) {
            ((h) obj).k((String) obj2);
        }
    }

    /* renamed from: ۠ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static r m1537(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((r) obj).s();
        }
        return null;
    }

    /* renamed from: ۠ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static int m1538(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((j) obj).j();
        }
        return 0;
    }

    /* renamed from: ۠ۨۤۨ, reason: not valid java name and contains not printable characters */
    public static String m1539(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((JSONObject) obj).toString();
        }
        return null;
    }

    /* renamed from: ۡ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m1540() {
        if (C0044.m7508() <= 0) {
            return "MOBILE_UA";
        }
        return null;
    }

    /* renamed from: ۡ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1541(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((com.github.catvod.spider.merge.Y0.b) obj).c;
        }
        return false;
    }

    /* renamed from: ۡۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m1542(Object obj) {
        if (C0006.m1726() < 0) {
            return f.m((String) obj);
        }
        return null;
    }

    /* renamed from: ۡۢۨ۠, reason: not valid java name and contains not printable characters */
    public static String m1543(Object obj) {
        if (C0049.m8038() < 0) {
            return com.github.catvod.spider.merge.S0.b.g((StringBuilder) obj);
        }
        return null;
    }

    /* renamed from: ۡۥۣۦ, reason: not valid java name and contains not printable characters */
    public static String m1544() {
        if (C0007.m1886() > 0) {
            return "vod_name";
        }
        return null;
    }

    /* renamed from: ۡۥۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m1545(Object obj) {
        if (C0039.m6529() <= 0) {
            return AbstractC0296g.d(obj);
        }
        return null;
    }

    /* renamed from: ۡۧۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1546(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((com.github.catvod.spider.merge.X.a) obj).c;
        }
        return false;
    }

    /* renamed from: ۢ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static l m1547(Object obj, Object obj2) {
        if (C0029.m5282() > 0) {
            return ((l) obj).L((com.github.catvod.spider.p000mergexbpq.c0.r) obj2);
        }
        return null;
    }

    /* renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static void m1548(Object obj) {
        if (C0047.m7837() > 0) {
            ((Map) obj).clear();
        }
    }

    /* renamed from: ۣۢۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m1550(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((AbstractC0296g) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۢۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1551() {
        if (C0045.m7538() < 0) {
            return "$$$";
        }
        return null;
    }

    /* renamed from: ۢۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static C0213u m1552() {
        if (C0001.m1164() < 0) {
            return B.d;
        }
        return null;
    }

    /* renamed from: ۢۤۢۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m1553(Object obj) {
        if (C0017.m3633() < 0) {
            return com.github.catvod.spider.merge.K0.a.f((byte[]) obj);
        }
        return null;
    }

    /* renamed from: ۢۧۨۧ, reason: not valid java name and contains not printable characters */
    public static Intent m1554(Object obj, Object obj2, Object obj3) {
        if (C0047.m7837() >= 0) {
            return ((Intent) obj).putExtra((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟۠, reason: not valid java name and contains not printable characters */
    public static p m1555() {
        if (C0011.m2755() > 0) {
            return p.o();
        }
        return null;
    }

    /* renamed from: ۣ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m1556(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((C0269d) obj).next();
        }
        return null;
    }

    /* renamed from: ۣ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static int m1557() {
        return 812 ^ C0057.f842;
    }

    /* renamed from: ۣۣۤۥ, reason: not valid java name and contains not printable characters */
    public static Half m1558(short s) {
        if (C0038.m6471() >= 0) {
            return Half.valueOf(s);
        }
        return null;
    }

    /* renamed from: ۣۥۣۧ, reason: not valid java name and contains not printable characters */
    public static void m1559() {
        if (C0012.m3024() > 0) {
            d.d();
        }
    }

    /* renamed from: ۣۦۣۣ, reason: not valid java name and contains not printable characters */
    public static String m1560(Object obj, Object obj2, Object obj3) {
        if (C0060.m9355() >= 0) {
            return ((C0246g) obj).c((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣۣۨۧ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m1561() {
        if (C0043.m7332() >= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        }
        return null;
    }

    /* renamed from: ۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1562(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((E) obj).f;
        }
        return false;
    }

    /* renamed from: ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static TextUtils.TruncateAt m1563() {
        if (C0019.m4065() <= 0) {
            return TextUtils.TruncateAt.MARQUEE;
        }
        return null;
    }

    /* renamed from: ۤۡۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1564(double d) {
        if (C0000.m1116() < 0) {
            return Double.isNaN(d);
        }
        return false;
    }

    /* renamed from: ۤۢۨۤ, reason: not valid java name and contains not printable characters */
    public static n m1565(Object obj) {
        if (C0047.m7837() > 0) {
            return ((com.github.catvod.spider.merge.V0.p) obj).i();
        }
        return null;
    }

    /* renamed from: ۣۤ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m1566(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((F) obj).j();
        }
        return false;
    }

    /* renamed from: ۣۤۥۣ, reason: not valid java name and contains not printable characters */
    public static HBhaiM m1567(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((com.github.catvod.spider.merge.b0.f) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۤۨ, reason: not valid java name and contains not printable characters */
    public static Long m1568(long j) {
        if (C0034.m6048() < 0) {
            return Long.valueOf(j);
        }
        return null;
    }

    /* renamed from: ۤۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static UUID m1569() {
        if (C0031.m5628() >= 0) {
            return k.f;
        }
        return null;
    }

    /* renamed from: ۤۦۣۡ, reason: not valid java name and contains not printable characters */
    public static PrintWriter m1570(Object obj, Object obj2) {
        if (C0053.m8389() >= 0) {
            return ((PrintWriter) obj).append((CharSequence) obj2);
        }
        return null;
    }

    /* renamed from: ۥ۟ۨۢ, reason: contains not printable characters */
    public static String m1571(Object obj) {
        if (C0056.m8886() < 0) {
            return ((com.github.catvod.spider.merge.F.k) obj).c();
        }
        return null;
    }

    /* renamed from: ۥۡۨ۟, reason: contains not printable characters */
    public static boolean m1572() {
        if (C0010.m2320() < 0) {
            return d.d;
        }
        return false;
    }

    /* renamed from: ۥۤ۟ۥ, reason: contains not printable characters */
    public static String m1573(Object obj) {
        if (C0017.m3633() < 0) {
            return ((com.github.catvod.spider.merge.l0.m) obj).a;
        }
        return null;
    }

    /* renamed from: ۥۤۦۦ, reason: contains not printable characters */
    public static String m1574(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((T) obj).b;
        }
        return null;
    }

    /* renamed from: ۦۢ۠ۧ, reason: contains not printable characters */
    public static HashMap m1575() {
        if (C0052.m8320() >= 0) {
            return com.github.catvod.spider.merge.W.x.k;
        }
        return null;
    }

    /* renamed from: ۦۤۦۦ, reason: contains not printable characters */
    public static String m1576(Object obj) {
        if (C0063.m9589() <= 0) {
            return com.github.catvod.spider.p000mergexbpq.j.o.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۦۦۡۤ, reason: contains not printable characters */
    public static void m1577(Object obj) {
        if (C0048.m7971() > 0) {
            ((Dialog) obj).dismiss();
        }
    }

    /* renamed from: ۦۦۡۦ, reason: contains not printable characters */
    public static void m1578(Object obj, Object obj2) {
        if (C0064.m9659() < 0) {
            ((j) obj).a((String) obj2);
        }
    }

    /* renamed from: ۦۣۨۧ, reason: contains not printable characters */
    public static void m1579(Object obj, int i, int i2) {
        if (C0018.m3956() >= 0) {
            com.github.catvod.spider.merge.P0.B.b((StringBuilder) obj, i, i2);
        }
    }

    /* renamed from: ۧ۟, reason: not valid java name and contains not printable characters */
    public static Object[] m1580(Object obj, Object obj2) {
        if (C0019.m4065() < 0) {
            return ((AbstractCollection) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* renamed from: ۣۧۤۥ, reason: not valid java name and contains not printable characters */
    public static void m1581(Object obj, Object obj2, Object obj3) {
        if (C0048.m7971() >= 0) {
            ((C0253n) obj).l((String) obj2, (String) obj3);
        }
    }

    /* renamed from: ۣۧۧ۟, reason: not valid java name and contains not printable characters */
    public static String m1582(Object obj) {
        if (C0059.m9257() < 0) {
            return ((com.github.catvod.spider.merge.J.b) obj).c();
        }
        return null;
    }

    /* renamed from: ۧۤۡۨ, reason: not valid java name and contains not printable characters */
    public static String m1583() {
        if (C0028.m5152() < 0) {
            return "0";
        }
        return null;
    }

    /* renamed from: ۧۥۢۡ, reason: not valid java name and contains not printable characters */
    public static int m1584(Object obj) {
        if (C0051.m8216() < 0) {
            return ((String) obj).length();
        }
        return 0;
    }

    /* renamed from: ۧۨۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1585(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((Buffer) obj).hasRemaining();
        }
        return false;
    }

    /* renamed from: ۨ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static HashMap m1586(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((HBlingDu) obj).a;
        }
        return null;
    }

    /* renamed from: ۨۥۨۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.Q.a m1587() {
        if (C0003.m1463() < 0) {
            return S.k();
        }
        return null;
    }

    /* renamed from: ۨۦۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.d m1588(Object obj) {
        if (C0002.m1242() >= 0) {
            return ((com.github.catvod.spider.merge.E0.k) obj).g;
        }
        return null;
    }

    /* renamed from: ۢۡۧۨ, reason: not valid java name and contains not printable characters */
    public static String m1549(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}