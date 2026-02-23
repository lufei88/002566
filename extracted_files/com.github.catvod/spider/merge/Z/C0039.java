package com.github.catvod.spider.merge.Z;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ShortcutInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebBackForwardList;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.github.catvod.spider.AppYsV2;
import com.github.catvod.spider.Baidu;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.HBPQ;
import com.github.catvod.spider.HBPguo;
import com.github.catvod.spider.HBhcShun;
import com.github.catvod.spider.XPathMac;
import com.github.catvod.spider.Zhaozy;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E0.h;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.E0.p;
import com.github.catvod.spider.merge.E0.s;
import com.github.catvod.spider.merge.F.i;
import com.github.catvod.spider.merge.F0.AbstractC0151h;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0144a;
import com.github.catvod.spider.merge.F0.C0164v;
import com.github.catvod.spider.merge.F0.F;
import com.github.catvod.spider.merge.F0.L;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.C0173e;
import com.github.catvod.spider.merge.P0.t;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.U0.C;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.C0177b0;
import com.github.catvod.spider.merge.U0.D;
import com.github.catvod.spider.merge.U0.E;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.U0.g1;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.n;
import com.github.catvod.spider.merge.W.w;
import com.github.catvod.spider.merge.W.x;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0253n;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.I;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.z;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0275e;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i.C0344d;
import com.github.catvod.spider.merge.k0.C0351b;
import com.github.catvod.spider.merge.l0.m;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.t0.AbstractC0371d;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.S.j;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.r;
import com.github.catvod.spider.p000mergexbpq.d.g;
import com.github.catvod.spider.p000mergexbpq.e0.O;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import javax.net.SocketFactory;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.Z.۠ۥۦۤ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0039 {

    /* renamed from: ۟۟۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static int f693 = 940;

    /* renamed from: ۟۟۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static void m6475(Object obj, int i) {
        if (C0054.m8557() <= 0) {
            ((ProgressDialog) obj).setProgress(i);
        }
    }

    /* renamed from: ۟۟ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m6476(Object obj, Object obj2) {
        if (C0050.m8121() <= 0) {
            return ((AlertDialog.Builder) obj).setOnCancelListener((DialogInterface.OnCancelListener) obj2);
        }
        return null;
    }

    /* renamed from: ۟۟ۡۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6477(Object obj) {
        if (C0043.m7332() > 0) {
            return ((C0164v) obj).g;
        }
        return false;
    }

    /* renamed from: ۟۟ۥۡۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.P.b m6478(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((com.github.catvod.spider.merge.P.a) obj).a();
        }
        return null;
    }

    /* renamed from: ۟۟ۥۥ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.g1.c m6479() {
        if (C0053.m8389() > 0) {
            return com.github.catvod.spider.merge.e1.d.c;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m6480(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((View) obj).getPaddingEnd();
        }
        return 0;
    }

    /* renamed from: ۟۟ۧۢۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6481(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((com.github.catvod.spider.merge.V0.d) obj).c();
        }
        return null;
    }

    /* renamed from: ۟۠۟۠۟, reason: not valid java name and contains not printable characters */
    public static Socket m6482(Object obj, Object obj2, int i, Object obj3, int i2) {
        if (C0000.m1116() < 0) {
            return ((SocketFactory) obj).createSocket((String) obj2, i, (InetAddress) obj3, i2);
        }
        return null;
    }

    /* renamed from: ۟۠ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static long m6483(Object obj, Object obj2) {
        if (C0060.m9355() >= 0) {
            return ((JSONObject) obj).getLong((String) obj2);
        }
        return 0L;
    }

    /* renamed from: ۣ۟۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static C0177b0 m6484() {
        if (C0058.m9131() < 0) {
            return g1.a;
        }
        return null;
    }

    /* renamed from: ۟۠ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static int m6485(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((C) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟۠ۧۦۢ, reason: not valid java name and contains not printable characters */
    public static int m6486(Object obj) {
        if (C0007.m1886() >= 0) {
            return ((Configuration) obj).densityDpi;
        }
        return 0;
    }

    /* renamed from: ۟۠ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static String m6487() {
        if (C0009.m2047() > 0) {
            return "c0";
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m6488(Object obj, long j, long j2) {
        if (C0061.m9359() <= 0) {
            return ((com.github.catvod.spider.merge.d0.d) obj).b(j, j2);
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6489(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((Config) obj).isBusy();
        }
        return false;
    }

    /* renamed from: ۟ۡۡۡۤ, reason: not valid java name and contains not printable characters */
    public static int m6490(Object obj) {
        if (C0022.m4497() > 0) {
            return ((com.github.catvod.spider.merge.b0.c) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۡۤ۟۠, reason: not valid java name and contains not printable characters */
    public static Activity m6491(Object obj) {
        if (C0037.m6350() < 0) {
            return ((x) obj).c();
        }
        return null;
    }

    /* renamed from: ۟ۡۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6492(Object obj) {
        if (C0007.m1886() >= 0) {
            return ((D) obj).a;
        }
        return false;
    }

    /* renamed from: ۟ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static String m6493(String str) {
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

    /* renamed from: ۟ۢۤۢۢ, reason: not valid java name and contains not printable characters */
    public static void m6494(Object obj, boolean z) {
        if (C0041.m6823() <= 0) {
            ((TextView) obj).setTextIsSelectable(z);
        }
    }

    /* renamed from: ۟ۢۤۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6495(Object obj) {
        if (C0007.m1886() > 0) {
            return ((ZipEntry) obj).isDirectory();
        }
        return false;
    }

    /* renamed from: ۟ۢۧۦۤ, reason: not valid java name and contains not printable characters */
    public static long m6496(Object obj, long j, Object obj2) {
        if (C0061.m9359() < 0) {
            return ((TimeUnit) obj).convert(j, (TimeUnit) obj2);
        }
        return 0L;
    }

    /* renamed from: ۟ۢۨۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m6497(Object obj, Object obj2) {
        if (C0004.m1557() <= 0) {
            return ((Set) obj).add(obj2);
        }
        return false;
    }

    /* renamed from: ۣۣ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m6498(Object obj) {
        if (C0053.m8389() > 0) {
            return ((AccessibilityNodeInfo) obj).getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static void m6499(Object obj, Object obj2, int i) {
        if (C0014.m3353() < 0) {
            ((O) obj).b((r) obj2, i);
        }
    }

    /* renamed from: ۣۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m6500(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((p) obj).d();
        }
        return 0;
    }

    /* renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m6501(Object obj, Object obj2) {
        if (C0047.m7837() >= 0) {
            ((P) obj).o((g1) obj2);
        }
    }

    /* renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m6502(Object obj, Object obj2) {
        if (C0000.m1116() <= 0) {
            return ((Activity) obj).checkSelfPermission((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m6503(int i) {
        if (C0021.m4379() > 0) {
            return com.github.catvod.spider.merge.E0.a.c(i);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m6504(Object obj) {
        if (C0044.m7508() <= 0) {
            return m.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۤ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static void m6505(Object obj, Object obj2, Object obj3) {
        if (C0028.m5152() <= 0) {
            ((Baidu) obj).init((Context) obj2, (String) obj3);
        }
    }

    /* renamed from: ۟ۤۡۦ۟, reason: not valid java name and contains not printable characters */
    public static void m6506(Object obj, Object obj2) {
        if (C0045.m7538() <= 0) {
            ((C0253n) obj).a((String) obj2);
        }
    }

    /* renamed from: ۟ۤۢۤۦ, reason: not valid java name and contains not printable characters */
    public static E m6507(Object obj) {
        if (C0018.m3956() > 0) {
            return ((com.github.catvod.spider.merge.T0.m) obj).d;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static void m6508(Object obj) {
        if (C0029.m5282() > 0) {
            ((M) obj).b();
        }
    }

    /* renamed from: ۟ۤۤۦ۟, reason: not valid java name and contains not printable characters */
    public static String m6509() {
        if (C0030.m5375() >= 0) {
            return "<!DOCTYPE html>\n<html lang=\"zh\" id=\"app\">\n<head>\n  <meta charset=\"UTF-8\" />\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n  <title>虎斑Danmaku</title>\n  <style>\n    :root {\n      --card-radius: 10px;\n      --btn-padding: 4px 6px;\n      --font-sm: 11px;\n      --gap-sm: 4px;\n      --transition: all 0.3s ease;\n      --primary-color: #00C853;\n    }\n\n    body {\n      font-family: 'Helvetica Neue', 'Microsoft YaHei', sans-serif;\n      margin: 0;\n      padding: 0;\n      background: #f9f9f9;\n      color: #333;\n      transition: background 0.5s, color 0.3s;\n      min-height: 100vh;\n    }\n\n    body.dark-mode {\n      background: #1a1a1a;\n      color: #e0e0e0;\n    }\n\n    body.dark-mode .page,\n    body.dark-mode {\n      background: #222;\n    }\n\n    body.dark-mode .video-card,\n    body.dark-mode .btn,\n    body.dark-mode #keyword,\n    body.dark-mode #border-radius,\n    body.dark-mode #push-link-display,\n    body.dark-mode .source-tag,\n    body.dark-mode .send-panel input,\n    body.dark-mode #proxy-ip,\n    body.dark-mode .card-overlay,\n    body.dark-mode #detail-header,\n    body.dark-mode .debug-info,\n    body.dark-mode #scan-panel {\n      background: rgba(40, 40, 40, 0.9) !important;\n      color: #e0e0e0 !important;\n      border: none !important;\n    }\n\n    body.dark-mode #proxy-ip {\n      background: rgba(40, 40, 40, 0.9) !important;\n      color: #e0e0e0 !important;\n    }\n\n    .home-controls {\n      display: flex;\n      justify-content: flex-start;\n      align-items: center;\n      margin: 4px 0;\n      padding: 0 4px;\n      gap: 4px;\n      width: 100%;\n      overflow-x: auto;\n      scrollbar-width: thin;\n      scrollbar-color: #00C853 transparent;\n      white-space: nowrap;\n      -webkit-overflow-scrolling: touch;\n      background: transparent !important;\n      backdrop-filter: none !important;\n      box-shadow: none !important;\n      border-radius: 0 !important;\n      max-height: none !important;\n      opacity: 1 !important;\n      pointer-events: auto !important;\n    }\n\n    .home-controls.collapsed {\n      display: none !important;\n    }\n\n    .home-controls::-webkit-scrollbar {\n      height: 2px;\n    }\n    \n    .home-controls::-webkit-scrollbar-track {\n      background: transparent;\n    }\n    \n    .home-controls::-webkit-scrollbar-thumb {\n      background: #00C853;\n      border-radius: 1px;\n    }\n\n    .home-controls .btn {\n      background: transparent !important;\n      border: none !important;\n      box-shadow: none !important;\n      color: #666;\n      transition: all 0.3s ease;\n      font-size: 9px;\n      padding: 4px;\n      min-height: 26px;\n      display: flex;\n      flex-direction: column;\n      align-items: center;\n      justify-content: center;\n      opacity: 0.9;\n      outline: none !important;\n      width: 32px;\n      height: 32px;\n      border-radius: 6px !important;\n      position: relative;\n      flex-shrink: 0;\n    }\n\n    body.dark-mode .home-controls .btn {\n      color: #aaa;\n      background: transparent !important;\n      border: none !important;\n    }\n\n    .home-controls .btn .icon {\n      width: 14px;\n      height: 14px;\n      margin-bottom: 1px;\n      transition: all 0.3s ease;\n      fill: currentColor;\n    }\n\n    .home-controls .btn:hover,\n    .home-controls .btn:focus {\n      background: rgba(0, 200, 83, 0.1) !important;\n      color: #00C853 !important;\n      opacity: 1;\n      transform: scale(1.03);\n    }\n\n    .home-controls .btn:active {\n      background: rgba(0, 200, 83, 0.2) !important;\n      transform: scale(0.98);\n    }\n\n    body.dark-mode .home-controls .btn:hover,\n    body.dark-mode .home-controls .btn:focus {\n      background: rgba(0, 200, 83, 0.15) !important;\n      color: #00C853 !important;\n    }\n\n    .layout-btn-text {\n      font-size: 7px;\n      margin-top: 0;\n    }\n\n    button.btn {\n      margin: 0;\n      padding: var(--btn-padding);\n      font-size: var(--font-sm);\n      border: none;\n      border-radius: 6px;\n      cursor: pointer;\n      background: rgba(68, 68, 68, 0.1);\n      color: #333;\n      transition: all 0.2s ease;\n      backdrop-filter: blur(4px);\n      min-height: 24px;\n      flex: 1;\n      max-width: 70px;\n      min-width: 50px;\n      font-size: 10px;\n      padding: 5px 6px;\n      display: flex;\n      flex-direction: column;\n      align-items: center;\n      justify-content: center;\n      line-height: 1.2;\n      height: 28px;\n    }\n    button.btn:hover {\n      background: rgba(68, 68, 68, 0.2);\n    }\n\n    button.btn.focused {\n      background: rgba(0, 200, 83, 0.3) !important;\n      outline: none;\n      transform: scale(1.05);\n    }\n\n    body.dark-mode button.btn.focused {\n      background: rgba(0, 200, 83, 0.4) !important;\n      color: white !important;\n    }\n\n    #theme-icon,\n    #detail-theme-icon {\n      width: 14px;\n      height: 14px;\n      display: flex;\n      align-items: center;\n      justify-content: center;\n    }\n\n    .theme-icon-svg {\n      width: 100%;\n      height: 100%;\n      fill: currentColor;\n      transition: all 0.3s ease;\n    }\n\n    .source-tag.focused {\n      transform: scale(1.05);\n    }\n\n    @keyframes rainbowShift {\n      0% { background-position: 0% 50%; }\n      100% { background-position: 400% 50%; }\n    }\n\n    @keyframes rainbowRotate {\n      0% { transform: rotate(0deg); }\n      100% { transform: rotate(360deg); }\n    }\n\n    @keyframes loadingPulse {\n      0%, 100% { opacity: 1; }\n      50% { opacity: 0.5; }\n    }\n\n    #scan-panel {\n      margin-top: 8px; \n      padding: 12px;\n      border-radius: 12px;\n      background: rgba(255, 255, 255, 0.95);\n      backdrop-filter: blur(6px);\n      box-shadow: 0 4px 20px rgba(0,0,0,0.1);\n      font-size: 11px;\n      color: #333;\n      line-height: 1.4;\n      width: 94%;\n      max-width: 280px;\n      margin-left: auto;\n      margin-right: auto;\n      position: relative;\n      border: 1px solid rgba(0,0,0,0.08);\n    }\n\n    body.dark-mode #scan-panel {\n      background: rgba(35, 35, 35, 0.95) !important;\n      color: #e0e0e0;\n      border: 1px solid rgba(255,255,255,0.08);\n    }\n\n    #scan-results {\n      overflow: auto; \n      max-height: 120px; \n      font-size: 10px; \n      background: rgba(255, 255, 255, 0.7);\n      padding: 6px; \n      border-radius: 6px;\n      border: 1px solid rgba(0,0,0,0.05);\n    }\n\n    body.dark-mode #scan-results {\n      background: rgba(50, 50, 50, 0.7) !important;\n      border: 1px solid rgba(255,255,255,0.05);\n    }\n\n    #scan-results table {\n      width: 100%; \n      border-collapse: collapse; \n      margin-top: 4px; \n      font-size: 11px;\n    }\n\n    #scan-results td {\n      padding: 4px 6px; \n      text-align: center; \n      border-bottom: 1px solid rgba(0,0,0,0.1);\n      font-family: monospace; \n      font-size: 11px; \n      width: auto;\n    }\n\n    body.dark-mode #scan-results td {\n      border-bottom: 1px solid rgba(255,255,255,0.1);\n    }\n\n    .panel-close {\n      position: absolute;\n      top: 6px;\n      right: 8px;\n      width: 24px;\n      height: 24px;\n      border: none;\n      background: rgba(255,0,0,0.1);\n      color: #ff4444;\n      border-radius: 50%;\n      display: flex;\n      align-items: center;\n      justify-content: center;\n      font-size: 14px;\n      cursor: pointer;\n      transition: all 0.2s ease;\n    }\n\n    .panel-close:hover {\n      background: rgba(255,0,0,0.2);\n      transform: scale(1.1);\n    }\n\n    .panel-title {\n      text-align: center;\n      font-weight: bold;\n      margin-bottom: 10px;\n      color: #00C853;\n      font-size: 12px;\n      padding-bottom: 6px;\n      border-bottom: 1px solid rgba(0,200,83,0.2);\n    }\n\n    .panel-content {\n      margin-top: 8px;\n    }\n\n    #scan-panel .btn {\n      background: rgba(0, 200, 83, 0.1) !important;\n      border: 1px solid rgba(0, 200, 83, 0.2) !important;\n      color: #00C853 !important;\n      border-radius: 8px;\n      transition: all 0.3s ease;\n    }\n\n    #scan-panel .btn:hover,\n    #scan-panel .btn.focused {\n      background: #00C853 !important;\n      color: white !important;\n      transform: translateY(-1px);\n    }\n\n    body.dark-mode #scan-panel .btn {\n      background: rgba(0, 200, 83, 0.15) !important;\n      border: 1px solid rgba(0, 200, 83, 0.3) !important;\n      color: #00C853 !important;\n    }\n\n    body.dark-mode #scan-panel .btn:hover,\n    body.dark-mode #scan-panel .btn.focused {\n      background: #00C853 !important;\n      color: white !important;\n    }\n\n    body.dark-mode ::placeholder,\n    body.dark-mode input:-ms-input-placeholder,\n    body.dark-mode input::-ms-input-placeholder {\n      color: #aaa !important;\n      opacity: 0.7;\n    }\n\n    body.dark-mode .video-card {\n      box-shadow: 0 1px 4px rgba(0, 0, 0, 0.5);\n    }\n\n    .video-card.focused {\n      transform: scale(1.05);\n      box-shadow: 0 0 0 3px #00C853, 0 0 15px rgba(0, 200, 83, 0.8) !important;\n      z-index: 2;\n    }\n\n    body.dark-mode .video-card.focused {\n      box-shadow: 0 0 0 3px #00C853, 0 0 15px rgba(0, 200, 83, 0.8) !important;\n    }\n\n    .source-tags.default-layout {\n      display: flex;\n      justify-content: center;\n      gap: 6px;\n      margin: 8px 0;\n      flex-wrap: wrap;\n    }\n    \n    .source-tags.horizontal-layout {\n      display: flex;\n      overflow-x: auto;\n      margin: 8px 0;\n      padding: 6px 0;\n      gap: 6px;\n      scrollbar-width: thin;\n      scrollbar-color: #00C853 transparent;\n      white-space: nowrap;\n      -webkit-overflow-scrolling: touch;\n    }\n    \n    .source-tags.horizontal-layout::-webkit-scrollbar {\n      height: 3px;\n    }\n    \n    .source-tags.horizontal-layout::-webkit-scrollbar-track {\n      background: transparent;\n    }\n    \n    .source-tags.horizontal-layout::-webkit-scrollbar-thumb {\n      background: #00C853;\n      border-radius: 2px;\n    }\n    \n    .source-tags.horizontal-layout .source-tag {\n      flex-shrink: 0;\n    }\n\n    .hidden { display: none !important; }\n\n    .page {\n      padding: 10px;\n      position: relative;\n      z-index: 1;\n    }\n\n    h1, h2, h3, h4 {\n      text-align: center;\n      margin: 12px 0;\n      font-weight: 500;\n    }\n\n    .home-header {\n      display: flex;\n      align-items: center;\n      justify-content: space-between;\n      margin-bottom: 6px;\n      gap: 6px;\n      padding: 0 4px;\n    }\n    \n    .app-title {\n      font-size: 0.8em;\n      font-weight: bold;\n      white-space: nowrap;\n      color: var(--primary-color);\n      margin: 0;\n      flex-shrink: 0;\n    }\n    \n    body.dark-mode .app-title {\n      color: var(--primary-color);\n    }\n    \n    .search-container {\n      flex: 1;\n      max-width: 240px;\n      margin: 0;\n    }\n    \n    .search-box {\n      display: flex;\n      width: 100%;\n      position: relative;\n      border-radius: 18px;\n      overflow: hidden;\n      background: rgba(255,255,255,0.9);\n      box-shadow: 0 2px 6px rgba(0,0,0,0.1);\n    }\n    \n    #keyword {\n      flex: 1;\n      padding: 8px 14px;\n      font-size: 13px;\n      border: none;\n      outline: none;\n      background: transparent;\n      color: #333;\n      width: 100%;\n      padding-right: 80px;\n    }\n    \n    .btn-search {\n      position: absolute;\n      right: 36px;\n      top: 50%;\n      transform: translateY(-50%);\n      width: 28px;\n      height: 28px;\n      border: none;\n      background: var(--primary-color);\n      color: white;\n      display: flex;\n      align-items: center;\n      justify-content: center;\n      cursor: pointer;\n      transition: all 0.2s ease;\n      font-size: 13px;\n      border-radius: 50%;\n      box-shadow: 0 2px 4px rgba(0,0,0,0.2);\n    }\n    \n    .btn-search:hover {\n      background: #00a844;\n      transform: translateY(-50%) scale(1.05);\n    }\n    \n    .app-menu-toggle {\n      position: absolute;\n      right: 0;\n      top: 0;\n      height: 100%;\n      width: 36px;\n      background: rgba(68, 68, 68, 0.1);\n      color: #333;\n      border: none;\n      font-size: 14px;\n      cursor: pointer;\n      display: flex;\n      align-items: center;\n      justify-content: center;\n      transition: all 0.2s ease;\n    }\n    \n    .app-menu-toggle:hover {\n      background: rgba(68, 68, 68, 0.2);\n    }\n    \n    body.dark-mode .search-box {\n      background: rgba(40, 40, 40, 0.9);\n    }\n    \n    body.dark-mode #keyword {\n      color: #e0e0e0;\n    }\n    \n    body.dark-mode .app-menu-toggle {\n      background: rgba(68, 68, 68, 0.3);\n      color: #e0e0e0;\n    }\n    \n    body.dark-mode .app-menu-toggle:hover {\n      background: rgba(68, 68, 68, 0.5);\n    }\n\n    .video-grid {\n      display: grid;\n      grid-template-columns: repeat(3, 1fr);\n      gap: 4px;\n      margin-top: 4px;\n      padding: 0;\n      justify-items: center;\n    }\n\n    @media (max-width: 520px) {\n      .video-grid {\n        grid-template-columns: repeat(3, 1fr);\n        justify-items: center;\n      }\n    }\n\n    .video-card {\n      border-radius: var(--card-radius);\n      overflow: hidden;\n      transition: transform 0.2s, box-shadow 0.2s;\n      background: rgba(255, 255, 255, 0.9);\n      cursor: pointer;\n      box-shadow: 0 1px 4px rgba(0,0,0,0.1);\n      position: relative;\n      height: 90px;\n      width: 100%;\n      max-width: 100%;\n    }\n\n    .video-card img {\n      width: 100%;\n      height: 100%;\n      object-fit: cover;\n      background: #f0f0f0;\n    }\n\n    .card-overlay {\n      position: absolute;\n      bottom: 0;\n      left: 0;\n      right: 0;\n      height: 22%;\n      background: rgba(0, 0, 0, 0.7);\n      padding: 2px 4px;\n      color: white;\n      font-size: 8px;\n      text-align: center;\n      border-radius: 0 0 var(--card-radius) var(--card-radius);\n      display: flex;\n      flex-direction: column;\n      justify-content: center;\n      gap: 1px;\n    }\n\n    .card-overlay h5 {\n      margin: 0;\n      font-size: 9px;\n      white-space: nowrap;\n      overflow: hidden;\n      text-overflow: ellipsis;\n      font-weight: 500;\n    }\n\n    .episode-badge {\n      position: absolute;\n      top: 3px;\n      right: 3px;\n      background: #00C853;\n      color: white;\n      font-size: 8px;\n      padding: 1px 4px;\n      border-radius: 3px;\n      z-index: 2;\n      white-space: nowrap;\n      max-width: 70%;\n      overflow: hidden;\n      text-overflow: ellipsis;\n      box-shadow: 0 1px 2px rgba(0,0,0,0.3);\n    }\n\n    .platform-tag {\n      font-size: 6px;\n      padding: 1px 4px;\n      border-radius: 3px;\n      color: white;\n      position: absolute;\n      top: 3px;\n      left: 3px;\n      z-index: 2;\n      white-space: nowrap;\n      box-shadow: 0 1px 2px rgba(0,0,0,0.3);\n      background-size: 100% 100%;\n      background-clip: padding-box;\n      text-shadow: 0 1px 1px rgba(0,0,0,0.5);\n    }\n\n    .platform-QQ {\n      background: linear-gradient(90deg, #FFD700, #00CED1, #1E90FF);\n      color: white;\n    }\n\n    .platform-奇异 {\n      background: linear-gradient(90deg, #00C853, #000000);\n      color: white;\n      text-shadow: 0 1px 1px rgba(0, 0, 0, 0.5);\n    }\n\n    .platform-优酷 {\n      background: linear-gradient(90deg, #FF6B00, #0055D8);\n      color: white;\n      text-shadow: 0 1px 1px rgba(0, 0, 0, 0.5);\n    }\n\n    .platform-芒果 {\n      background: linear-gradient(90deg, #FFD700, #FFFFFF);\n      color: #000;\n      text-shadow: none;\n    }\n\n    .platform-哔哩 {\n      background: linear-gradient(90deg, #FB7299, #FFB6C1);\n      color: white;\n      text-shadow: 0 1px 1px rgba(0, 0, 0, 0.3);\n    }\n\n    .platform-人人 {\n      background: linear-gradient(90deg, #87CEEB, #CCFBFF);\n      color: white;\n    }\n    \n    .platform-韩圈 {\n      background: linear-gradient(90deg, #800080, #EAD6EE);\n      color: white;\n    }\n\n    .platform-360 {\n      background: linear-gradient(90deg, #00C853, #FFD700, #00C853);\n      color: white;\n    }\n    .platform-采集站 {\n      background: linear-gradient(90deg, #9FA5D5, #EAE5C9, #6CC6CB);\n      color: white;\n    }\n    .platform-全部 {\n      background: repeating-linear-gradient(90deg, red, orange, yellow, green, cyan, blue, purple);\n      background-size: 200% 100%;\n      animation: rainbowShift 3s linear infinite;\n      color: white;\n    }\n    .platform-other {\n      background: #777;\n      color: white;\n    }\n\n    .video-card.focused::after {\n      content: '';\n      position: absolute;\n      inset: 0;\n      border-radius: var(--card-radius);\n      padding: 2px;\n      background: repeating-linear-gradient(90deg, red, orange, yellow, green, cyan, blue, purple);\n      background-size: 200% 100%;\n      animation: rainbowShift 3s linear infinite;\n      -webkit-mask:\n        linear-gradient(#fff 0 0) content-box,\n        linear-gradient(#fff 0 0);\n      -webkit-mask-composite: xor;\n      mask-composite: exclude;\n      pointer-events: none;\n      z-index: 3;\n    }\n\n    .send-panel {\n      display: flex;\n      justify-content: center;\n      align-items: center;\n      gap: 5px;\n      margin: 6px auto;\n      flex-wrap: wrap;\n    }\n    .send-panel input {\n      padding: 5px 6px;\n      font-size: 12px;\n      border: none;\n      border-radius: 5px;\n      width: 90px;\n      background: rgba(255,255,255,0.9);\n      color: #333;\n    }\n    .send-panel button {\n      min-width: 45px;\n      font-size: 11px;\n      padding: 5px 8px;\n    }\n\n    .episodes {\n      display: flex;\n      flex-wrap: wrap;\n      justify-content: center;\n      align-items: flex-start;\n      gap: 5px;\n      margin: 6px 0;\n      padding: 5px;\n      width: 100%;\n      max-width: 100%;\n      min-height: 35px;\n      max-height: calc(100vh - 240px);\n      overflow-y: auto;\n      -webkit-overflow-scrolling: touch;\n      box-sizing: border-box;\n    }\n\n    .episodes button {\n      min-width: 35px;\n      flex-grow: 1;\n      max-width: 100px;\n      min-height: 30px;\n      height: auto;\n      padding: 5px 3px;\n      font-size: 12px;\n      line-height: 1.2;\n      background: rgba(68, 68, 68, 0.4);\n      color: white;\n      border: none;\n      border-radius: 6px;\n      cursor: pointer;\n      transition: all 0.2s ease;\n      box-shadow: 0 1px 3px rgba(0,0,0,0.2);\n      text-align: center;\n      white-space: normal;\n      overflow: hidden;\n      word-break: break-word;\n      display: -webkit-box;\n      -webkit-line-clamp: 2;\n      -webkit-box-orient: vertical;\n    }\n\n    .episodes button:hover {\n      background: rgba(0, 200, 83, 0.7);\n      transform: translateY(-1px);\n      box-shadow: 0 2px 5px rgba(0, 200, 83, 0.4);\n    }\n\n    .episodes button.long-title {\n      font-size: 10px;\n      padding: 3px 2px;\n    }\n\n    #detail-header {\n      display: flex;\n      align-items: flex-start;\n      gap: 12px;\n      margin-bottom: 12px;\n      background: rgba(255,255,255,0.9);\n      padding: 10px;\n      border-radius: 10px;\n      box-shadow: 0 2px 6px rgba(0,0,0,0.1);\n      overflow: hidden;\n      transition: all 0.3s ease;\n    }\n\n    #detail-header.collapsed {\n      padding: 8px 10px;\n      min-height: 60px;\n    }\n\n    #detail-header.collapsed .poster {\n      height: 50px;\n      width: 35px;\n    }\n\n    #detail-header.collapsed .info h2 {\n      font-size: 0.9em;\n    }\n\n    #detail-header.collapsed .info .meta-info {\n      display: none;\n    }\n\n    #detail-header.collapsed .info .vod-content {\n      display: none;\n    }\n\n    #detail-header .poster {\n      max-width: 500px;\n      height: 100px;\n      border-radius: 6px;\n      object-fit: cover;\n      flex-shrink: 0;\n      background: #f0f0f0;\n      transition: all 0.3s ease;\n    }\n\n    #detail-header .info {\n      flex: 1;\n      min-width: 0;\n    }\n\n    #detail-header .info h2 {\n      margin: 0 0 6px 0;\n      font-size: 1em;\n      white-space: nowrap;\n      overflow: hidden;\n      text-overflow: ellipsis;\n      color: #00C853;\n    }\n\n    #detail-header .info .meta-info {\n      font-size: 10px;\n      color: #666;\n      line-height: 1.3;\n      margin-bottom: 8px;\n      display: flex;\n      flex-wrap: nowrap;\n      gap: 8px;\n      align-items: center;\n      overflow-x: auto;\n      white-space: nowrap;\n      padding-bottom: 4px;\n    }\n\n    #detail-header .info .meta-info::-webkit-scrollbar {\n      height: 2px;\n    }\n\n    #detail-header .info .meta-info::-webkit-scrollbar-track {\n      background: transparent;\n    }\n\n    #detail-header .info .meta-info::-webkit-scrollbar-thumb {\n      background: #00C853;\n      border-radius: 2px;\n    }\n\n    body.dark-mode #detail-header .info .meta-info {\n      color: #aaa;\n    }\n\n    #detail-header .info .vod-content {\n      font-size: 10px;\n      color: #888;\n      line-height: 1.3;\n      max-height: 60px;\n      overflow: hidden;\n      text-overflow: ellipsis;\n      display: -webkit-box;\n      -webkit-line-clamp: 3;\n      -webkit-box-orient: vertical;\n      transition: max-height 0.3s ease;\n    }\n\n    body.dark-mode #detail-header .info .vod-content {\n      color: #ccc;\n    }\n\n    #detail-header .info .vod-content.collapsed {\n      max-height: 20px;\n      overflow: hidden;\n    }\n\n    #detail-header .controls {\n      display: flex;\n      flex-direction: column;\n      gap: 5px;\n      justify-content: flex-start;\n    }\n\n    #detail-header .menu-bar {\n      display: flex;\n      gap: 8px;\n      margin-top: 8px;\n      justify-content: space-between;\n      align-items: center;\n      width: 100%;\n    }\n\n    #detail-header .menu-bar .menu-btn {\n      background: transparent;\n      border: none;\n      color: #666;\n      cursor: pointer;\n      padding: 4px;\n      border-radius: 4px;\n      transition: all 0.2s ease;\n      display: flex;\n      align-items: center;\n      justify-content: center;\n    }\n\n    #detail-header .menu-bar .menu-btn:hover,\n    #detail-header .menu-bar .menu-btn.focused {\n      color: #00C853;\n      background: rgba(0, 200, 83, 0.1);\n    }\n\n    body.dark-mode #detail-header .menu-bar .menu-btn {\n      color: #aaa;\n    }\n\n    body.dark-mode #detail-header .menu-bar .menu-btn:hover,\n    body.dark-mode #detail-header .menu-bar .menu-btn.focused {\n      color: #00C853;\n    }\n\n    .menu-title {\n      font-size: 12px;\n      font-weight: bold;\n      color: #00C853;\n      display: flex;\n      align-items: center;\n      gap: 4px;\n    }\n\n    .source-tag {\n      padding: 5px 10px;\n      font-size: 11px;\n      border-radius: 6px;\n      border: none;\n      cursor: pointer;\n      min-width: 50px;\n      transition: all 0.2s ease;\n    }\n    .source-tag.active {\n      box-shadow: 0 0 0 2px #00C853, 0 0 6px rgba(0, 200, 83, 0.4);\n    }\n\n    .debug-info {\n      font-size: 10px;\n      color: #666;\n      text-align: center;\n      margin-top: 8px;\n    }\n\n    #detail-bg {\n      position: fixed;\n      top: 0;\n      left: 0;\n      width: 100%;\n      height: 100%;\n      background-size: cover;\n      background-position: center;\n      opacity: 0.25;\n      z-index: -1;\n      filter: blur(8px);\n      transition: background-image 0.5s ease;\n      background-color: #f0f0f0;\n    }\n\n    #toast {\n      position: fixed;\n      top: 50px;\n      left: 50%;\n      transform: translateX(-50%);\n      padding: 8px 16px;\n      font-size: 12px;\n      font-weight: 500;\n      border-radius: 6px;\n      color: white;\n      white-space: nowrap;\n      opacity: 0;\n      pointer-events: none;\n      z-index: 99999;\n      transition: opacity 0.3s ease;\n      background: repeating-linear-gradient(90deg, red, orange, yellow, green, cyan, blue, purple);\n      background-size: 200% 100%;\n      animation: rainbowShift 3s linear infinite;\n      box-shadow: 0 4px 12px rgba(0,0,0,0.3);\n      backdrop-filter: blur(4px);\n      text-shadow: 0 1px 2px rgba(0,0,0,0.5);\n      max-width: 90%;\n      text-overflow: ellipsis;\n      overflow: hidden;\n    }\n\n    .loading {\n      text-align: center;\n      padding: 8px;\n      color: #666;\n      font-size: 12px;\n    }\n\n    body.dark-mode .loading {\n      color: #aaa;\n    }\n\n    .video-card.loading {\n      background: linear-gradient(90deg, #f0f0f0 25%, #e0e0e0 50%, #f0f0f0 75%);\n      background-size: 200% 100%;\n      animation: loading 1.5s infinite;\n    }\n\n    @keyframes loading {\n      0% { background-position: 200% 0; }\n      100% { background-position: -200% 0; }\n    }\n\n    #ep-loading {\n      text-align: center;\n      padding: 10px;\n      font-size: 12px;\n      color: #666;\n      background: rgba(255,255,255,0.8);\n      border-radius: 6px;\n      margin: 8px 0;\n    }\n\n    body.dark-mode #ep-loading {\n      background: rgba(40,40,40,0.8);\n      color: #aaa;\n    }\n    \n    #danmu-bar {\n      position: fixed;\n      bottom: 0;\n      left: 0;\n      right: 0;\n      background: rgba(255, 255, 255, 0.95);\n      backdrop-filter: blur(10px);\n      border-top: 1px solid rgba(0, 0, 0, 0.1);\n      padding: 8px 12px;\n      display: flex;\n      align-items: center;\n      gap: 8px;\n      z-index: 1000;\n      transition: all 0.3s ease;\n    }\n    \n    body.dark-mode #danmu-bar {\n      background: rgba(30, 30, 30, 0.95);\n      border-top: 1px solid rgba(255, 255, 255, 0.1);\n    }\n    \n    #danmu-bar .user-input {\n      display: flex;\n      align-items: center;\n      background: rgba(0, 200, 83, 0.1);\n      border-radius: 20px;\n      padding: 4px 8px;\n      min-width: 90px;\n      max-width: 90px;\n      flex-shrink: 0;\n      position: relative;\n    }\n    \n    #danmu-bar .user-input input {\n      border: none;\n      background: transparent;\n      font-size: 12px;\n      width: 100%;\n      outline: none;\n      padding: 2px 4px;\n      color: inherit;\n    }\n    \n    #danmu-bar .user-input .random-icon {\n      font-size: 12px;\n      cursor: pointer;\n      padding: 2px;\n      border-radius: 50%;\n      transition: all 0.2s ease;\n      margin-left: 4px;\n      flex-shrink: 0;\n    }\n    \n    #danmu-bar .user-input .random-icon:hover {\n      background: rgba(0, 200, 83, 0.2);\n      transform: scale(1.1);\n    }\n    \n    .input-separator {\n      color: #ccc;\n      font-size: 14px;\n      margin: 0 4px;\n      flex-shrink: 0;\n    }\n    \n    body.dark-mode .input-separator {\n      color: #666;\n    }\n    \n    #danmu-bar .message-input {\n      flex: 1;\n      display: flex;\n      align-items: center;\n      background: rgba(255, 255, 255, 0.9);\n      border-radius: 20px;\n      padding: 4px 12px;\n      border: 1px solid rgba(0, 0, 0, 0.1);\n      position: relative;\n      overflow: hidden;\n      min-width: 0;\n    }\n    \n    body.dark-mode #danmu-bar .message-input {\n      background: rgba(50, 50, 50, 0.9);\n      border: 1px solid rgba(255, 255, 255, 0.1);\n    }\n    \n    #danmu-bar .message-input input {\n      border: none;\n      background: transparent;\n      font-size: 13px;\n      width: 100%;\n      outline: none;\n      padding: 2px 4px;\n      color: inherit;\n      flex: 1;\n      min-width: 0;\n    }\n    \n    #danmu-bar .send-btn {\n      background: var(--primary-color);\n      color: white;\n      border: none;\n      border-radius: 20px;\n      padding: 6px 12px;\n      font-size: 12px;\n      cursor: pointer;\n      display: flex;\n      align-items: center;\n      gap: 4px;\n      transition: all 0.2s ease;\n      flex-shrink: 0;\n      margin-left: 8px;\n    }\n    \n    #danmu-bar .send-btn:hover {\n      background: #00a844;\n      transform: scale(1.05);\n    }\n    \n    #danmu-bar .send-btn:active {\n      transform: scale(0.95);\n    }\n    \n    .page {\n      padding-bottom: 60px;\n    }\n    \n    @media (max-width: 480px) {\n      #danmu-bar {\n        padding: 6px 10px;\n        gap: 6px;\n      }\n      \n      #danmu-bar .user-input {\n        min-width: 80px;\n        max-width: 80px;\n        padding: 3px 6px;\n      }\n      \n      #danmu-bar .user-input input {\n        font-size: 11px;\n      }\n      \n      .input-separator {\n        margin: 0 3px;\n        font-size: 12px;\n      }\n      \n      #danmu-bar .message-input {\n        padding: 3px 10px;\n      }\n      \n      #danmu-bar .message-input input {\n        font-size: 12px;\n      }\n      \n      #danmu-bar .send-btn {\n        padding: 5px 10px;\n        font-size: 11px;\n        margin-left: 6px;\n      }\n    }\n    \n    @media (max-width: 360px) {\n      #danmu-bar {\n        padding: 5px 8px;\n        gap: 4px;\n      }\n      \n      #danmu-bar .user-input {\n        min-width: 70px;\n        max-width: 70px;\n        padding: 2px 4px;\n      }\n      \n      #danmu-bar .user-input input {\n        font-size: 10px;\n      }\n      \n      .input-separator {\n        margin: 0 2px;\n        font-size: 10px;\n      }\n      \n      #danmu-bar .message-input {\n        padding: 2px 8px;\n      }\n      \n      #danmu-bar .message-input input {\n        font-size: 11px;\n      }\n      \n      #danmu-bar .send-btn {\n        padding: 4px 8px;\n        font-size: 10px;\n        margin-left: 4px;\n      }\n    }\n    \n    /* 精简模式剧集样式 */\n    .simple-episodes-container {\n      margin: 8px 0;\n      padding: 8px;\n      background: rgba(255, 255, 255, 0.9);\n      border-radius: 8px;\n      box-shadow: 0 2px 6px rgba(0,0,0,0.1);\n    }\n    \n    body.dark-mode .simple-episodes-container {\n      background: rgba(40, 40, 40, 0.9);\n    }\n    \n    .simple-episodes-header {\n      display: flex;\n      justify-content: space-between;\n      align-items: center;\n      margin-bottom: 8px;\n      padding-bottom: 6px;\n      border-bottom: 1px solid rgba(0, 200, 83, 0.2);\n    }\n    \n    .simple-episodes-title {\n      font-size: 12px;\n      font-weight: bold;\n      color: #00C853;\n      flex: 1;\n      white-space: nowrap;\n      overflow: hidden;\n      text-overflow: ellipsis;\n    }\n    \n    .simple-episodes-controls {\n      display: flex;\n      gap: 4px;\n      align-items: center;\n    }\n    \n    .simple-episodes-close,\n    .simple-order-toggle {\n      background: rgba(68, 68, 68, 0.1);\n      color: #666;\n      border: none;\n      border-radius: 4px;\n      padding: 4px 6px;\n      font-size: 10px;\n      cursor: pointer;\n      transition: all 0.2s ease;\n      display: flex;\n      align-items: center;\n      justify-content: center;\n      min-width: 24px;\n      height: 24px;\n    }\n    \n    body.dark-mode .simple-episodes-close,\n    body.dark-mode .simple-order-toggle {\n      background: rgba(68, 68, 68, 0.3);\n      color: #aaa;\n    }\n    \n    .simple-episodes-close:hover,\n    .simple-order-toggle:hover {\n      background: rgba(0, 200, 83, 0.1);\n      color: #00C853;\n    }\n    \n    .simple-episodes {\n      display: flex;\n      flex-wrap: wrap;\n      gap: 4px;\n      max-height: 300px;\n      overflow-y: auto;\n      padding: 5px;\n    }\n    \n    .simple-episodes button {\n      min-width: 42px;\n      flex-grow: 1;\n      max-width: 85px;\n      min-height: 32px;\n      padding: 5px 3px;\n      font-size: 11px;\n      line-height: 1.3;\n      background: rgba(68, 68, 68, 0.4);\n      color: white;\n      border: none;\n      border-radius: 6px;\n      cursor: pointer;\n      transition: all 0.2s ease;\n      box-shadow: 0 1px 3px rgba(0,0,0,0.2);\n      text-align: center;\n      white-space: normal;\n      overflow: hidden;\n      word-break: break-word;\n      display: -webkit-box;\n      -webkit-line-clamp: 2;\n      -webkit-box-orient: vertical;\n    }\n    \n    .simple-episodes button:hover {\n      background: rgba(0, 200, 83, 0.7);\n      transform: translateY(-1px);\n      box-shadow: 0 2px 4px rgba(0, 200, 83, 0.4);\n    }\n    \n    .simple-episodes button.long-title {\n      font-size: 10px;\n      padding: 4px 2px;\n      -webkit-line-clamp: 2;\n    }\n    \n    /* 搜索动画 */\n    .search-loading {\n      display: flex;\n      flex-direction: column;\n      align-items: center;\n      justify-content: center;\n      padding: 40px 0;\n      width: 100%;\n      text-align: center;\n      grid-column: 1 / -1;\n      justify-self: center;\n    }\n    \n    .rainbow-loader {\n      width: 40px;\n      height: 40px;\n      margin: 20px auto;\n      border-radius: 50%;\n      background: conic-gradient(\n        from 0deg,\n        red,\n        orange,\n        yellow,\n        green,\n        cyan,\n        blue,\n        purple,\n        red\n      );\n      animation: rainbowRotate 1s linear infinite;\n      position: relative;\n    }\n    \n    .rainbow-loader::before {\n      content: '';\n      position: absolute;\n      top: 3px;\n      left: 3px;\n      right: 3px;\n      bottom: 3px;\n      background: #f9f9f9;\n      border-radius: 50%;\n    }\n    \n    body.dark-mode .rainbow-loader::before {\n      background: #1a1a1a;\n    }\n    \n    .search-loading-text {\n      font-size: 12px;\n      color: #666;\n      margin-top: 12px;\n      animation: loadingPulse 1.5s ease-in-out infinite;\n    }\n    \n    body.dark-mode .search-loading-text {\n      color: #aaa;\n    }\n    \n    /* 精简模式样式 */\n    .simple-source-tags {\n      display: none;\n    }\n    \n    /* 性能优化相关 */\n    .will-change-transform {\n      will-change: transform;\n    }\n    \n    .optimized-render {\n      contain: content;\n    }\n    \n    /* 视频列表容器 */\n    #video-list {\n      width: 100%;\n      display: grid;\n      grid-template-columns: repeat(3, 1fr);\n      gap: 4px;\n      justify-items: center;\n    }\n  </style>\n</head>\n<body>\n\n<!-- 主页 -->\n<div id=\"home-page\" class=\"page\">\n  <!-- 新的紧凑头部布局 -->\n  <div class=\"home-header\">\n    <h1 class=\"app-title\">虎斑Danmaku</h1>\n    \n    <div class=\"search-container\">\n      <div class=\"search-box\">\n        <input type=\"text\" id=\"keyword\" placeholder=\"输入剧名/关键词\" />\n        <button class=\"btn-search\" onclick=\"search()\">\n          <svg class=\"icon\" width=\"14\" height=\"14\" viewBox=\"0 0 24 24\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\">\n            <circle cx=\"11\" cy=\"11\" r=\"7\" stroke=\"white\" stroke-width=\"2\"/>\n            <path d=\"M20 20L17 17\" stroke=\"white\" stroke-width=\"2\" stroke-linecap=\"round\"/>\n          </svg>\n        </button>\n        <button class=\"app-menu-toggle\" onclick=\"toggleMenu()\">☰</button>\n      </div>\n    </div>\n  </div>\n\n  <!-- 主页控制按钮 -->\n  <div id=\"home-controls\" class=\"home-controls collapsed\">\n    <button class=\"btn\" onclick=\"quickSearch()\" tabIndex=\"0\">\n      <svg class=\"icon\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\">\n        <path d=\"M15.5 14h-.79l-.28-.27C15.41 12.59 16 11.11 16 9.5 16 5.91 13.09 3 9.5 3S3 5.91 3 9.5 5.91 16 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z\"/>\n      </svg>\n      速搜\n    </button>\n    <button class=\"btn\" onclick=\"toggleMode()\" tabIndex=\"0\" id=\"mode-btn\">\n      <svg class=\"icon\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\">\n        <path d=\"M4 8h4V4H4v4zm6 12h4v-4h-4v4zm-6 0h4v-4H4v4zm0-6h4v-4H4v4zm6 0h4v-4h-4v4zm6-10v4h4V4h-4zm-6 4h4V4h-4v4zm6 6h4v-4h-4v4zm0 6h4v-4h-4v4z\"/>\n      </svg>\n      <span class=\"layout-btn-text\" id=\"mode-text\">详情</span>\n    </button>\n    <button class=\"btn\" onclick=\"toggleScanPanel()\" tabIndex=\"0\">\n      <svg class=\"icon\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\">\n        <path d=\"M19.14,12.94c0.04-0.3,0.06-0.61,0.06-0.94c0-0.32-0.02-0.64-0.07-0.94l2.03-1.58c0.18-0.14,0.23-0.41,0.12-0.61 l-1.92-3.32c 0.12-0.22-0.37-0.29-0.59-0.22l-2.39,0.96c-0.5-0.38-1.03-0.7-1.62-0.94L14.4,2.81c-0.04-0.24-0.24-0.41-0.48-0.41 h-3.84c-0.24,0-0.43,0.17-0.47,0.41L9.25,5.35C8.66,5.59,8.12,5.92,7.63,6.29L5.24,5.33c-0.22-0.08-0.47,0-0.59,0.22L2.74,8.87 C2.62,9.08,2.66,9.34,2.86,9.48l2.03,1.58C4.84,11.36,4.82,11.69,4.82,12s0.02,0.64,0.07,0.94l-2.03,1.58 c-0.18,0.14-0.23,0.41-0.12,0.61l1.92,3.32c0.12,0.22,0.37,0.29,0.59,0.22l2.39-0.96c0.5,0.38,1.03,0.7,1.62,0.94l0.36,2.54 c0.05,0.24,0.24,0.41,0.48,0.41h3.84c0.24,0,0.44-0.17,0.47-0.41l0.36-2.54c0.59-0.24,1.13-0.56,1.62-0.94l2.39,0.96 c0.22,0.08,0.47,0,0.59-0.22l1.92-3.32c0.12-0.22,0.07-0.47-0.12-0.61L19.14,12.94z M12,15.6c-1.98,0-3.6-1.62-3.6-3.6 s1.62-3.6,3.6-3.6s3.6,1.62,3.6,3.6S13.98,15.6,12,15.6z\"/>\n      </svg>\n      调试\n    </button>\n    <button class=\"btn\" onclick=\"showQR()\" tabIndex=\"0\">\n      <svg class=\"icon\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\">\n        <path d=\"M3 11h8V3H3v8zm2-6h4v4H5V5zM3 21h8v-8H3v8zm2-6h4v4H5v-4zM13 3v8h8V3h-8zm6 6h-4V5h4v4z\"/>\n        <path d=\"M19 19h2v2h-2zM15 15h2v2h-2zM15 19h2v2h-2zM19 15h2v2h-2z\"/>\n      </svg>\n      扫描\n    </button>\n    <!-- 修复后的主题按钮 -->\n    <button class=\"btn\" onclick=\"toggleTheme()\" tabIndex=\"0\" id=\"theme-btn\">\n      <span id=\"theme-icon\">\n        <svg class=\"theme-icon-svg\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\">\n          <path d=\"M12,18c-3.3,0-6-2.7-6-6s2.7-6,6-6s6,2.7,6,6S15.3,18,12,18zM12,8c-2.2,0-4,1.8-4,4c0,2.2,1.8,4,4,4c2.2,0,4-1.8,4-4C16,9.8,14.2,8,12,8z\"/>\n          <path d=\"M12,4c-0.6,0-1-0.4-1-1V1c0-0.6,0.4-1,1-1s1,0.4,1,1v2C13,3.6,12.6,4,12,4z\"/>\n          <path d=\"M12,24c-0.6,0-1-0.4-1-1v-2c0-0.6,0.4-1,1-1s1,0.4,1,1v2C13,23.6,12.6,24,12,24z\"/>\n          <path d=\"M5.6,6.6c-0.3,0-0.5-0.1-0.7-0.3L3.5,4.9c-0.4-0.4-0.4-1,0-1.4s1-0.4,1.4,0l1.4,1.4c0.4,0.4,0.4,1,0,1.4C6.1,6.5,5.9,6.6,5.6,6.6z\"/>\n          <path d=\"M19.8,20.8c-0.3,0-0.5-0.1-0.7-0.3l-1.4-1.4c-0.4-0.4-0.4-1,0-1.4s1-0.4,1.4,0l1.4,1.4c0.4,0.4,0.4,1,0,1.4C20.3,20.7,20.1,20.8,19.8,20.8z\"/>\n          <path d=\"M3,13H1c-0.6,0-1-0.4-1-1s0.4-1,1-1h2c0.6,0,1,0.4,1,1S3.6,13,3,13z\"/>\n          <path d=\"M23,13h-2c-0.6,0-1-0.4-1-1s0.4-1,1-1h2c0.6,0,1,0.4,1,1S23.6,13,23,13z\"/>\n          <path d=\"M4.2,20.8c-0.3,0-0.5-0.1-0.7-0.3c-0.4-0.4-0.4-1,0-1.4l1.4-1.4c0.4-0.4,1-0.4,1.4,0s0.4,1,0,1.4l-1.4,1.4C4.7,20.7,4.5,20.8,4.2,20.8z\"/>\n          <path d=\"M18.4,6.6c-0.3,0-0.5-0.1-0.7-0.3c-0.4-0.4-0.4-1,0-1.4l1.4-1.4c0.4-0.4,1-0.4,1.4,0s0.4,1,0,1.4l-1.4,1.4C18.9,6.5,18.7,6.6,18.4,6.6z\"/>\n        </svg>\n      </span>\n      <span id=\"theme-label\">系统</span>\n    </button>\n  </div>\n\n  <!-- 扫描设备折叠面板 -->\n  <div id=\"scan-panel\" class=\"hidden\">\n    <button class=\"panel-close\" onclick=\"toggleScanPanel()\">×</button>\n    \n    <div class=\"panel-title\">设备调试面板</div>\n    \n    <div style=\"display:flex; gap:5px; margin-bottom:8px;\">\n      <button id=\"scan-btn\" class=\"btn\" style=\"flex:1; height:24px; font-size:10px; padding:3px;\">\n        <svg width=\"12\" height=\"12\" viewBox=\"0 0 24 24\" fill=\"currentColor\" style=\"margin-right:4px;\">\n          <path d=\"M15.5 14h-.79l-.28-.27C15.41 12.59 16 11.11 16 9.5 16 5.91 13.09 3 9.5 3S3 5.91 3 9.5 5.91 16 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z\"/>\n        </svg>\n        查找设备\n      </button>\n      <button class=\"btn\" style=\"flex:1; height:24px; font-size:10px; padding:3px;\" onclick=\"pingProxy()\">\n        <svg width=\"12\" height=\"12\" viewBox=\"0 0 24 24\" fill=\"currentColor\" style=\"margin-right:4px;\">\n          <path d=\"M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm-2 15l-5-5 1.41-1.41L10 14.17l7.59-7.59L19 8l-9 9z\"/>\n        </svg>\n        检测服务\n      </button>\n      <button class=\"btn\" style=\"flex:1; height:24px; font-size:10px; padding:3px;\" onclick=\"setLocalMode()\">\n        <svg width=\"12\" height=\"12\" viewBox=\"0 0 24 24\" fill=\"currentColor\" style=\"margin-right:4px;\">\n          <path d=\"M10 20v-6h4v6h5v-8h3L12 3 2 12h3v8z\"/>\n        </svg>\n        本机模式\n      </button>\n      <button class=\"btn\" style=\"flex:1; height:24px; font-size:10px; padding:3px;\" onclick=\"openSettings()\">\n        <svg width=\"12\" height=\"12\" viewBox=\"0 0 24 24\" fill=\"currentColor\" style=\"margin-right:4px;\">\n          <path d=\"M19.14,12.94c0.04-0.3,0.06-0.61,0.06-0.94c0-0.32-0.02-0.64-0.07-0.94l2.03-1.58c0.18-0.14,0.23-0.41,0.12-0.61 l-1.92-3.32c-0.12-0.22-0.37-0.29-0.59-0.22l-2.39,0.96c-0.5-0.38-1.03-0.7-1.62-0.94L14.4,2.81c-0.04-0.24-0.24-0.41-0.48-0.41 h-3.84c-0.24,0-0.43,0.17-0.47,0.41L9.25,5.35C8.66,5.59,8.12,5.92,7.63,6.29L5.24,5.33c-0.22-0.08-0.47,0-0.59,0.22L2.74,8.87 C2.62,9.08,2.66,9.34,2.86,9.48l2.03,1.58C4.84,11.36,4.82,11.69,4.82,12s0.02,0.64,0.07,0.94l-2.03,1.58 c-0.18,0.14-0.23,0.41-0.12,0.61l1.92,3.32c0.12,0.22,0.37,0.29,0.59,0.22l2.39-0.96c0.5,0.38,1.03,0.7,1.62,0.94l0.36,2.54 c0.05,0.24,0.24,0.41,0.48,0.41h3.84c0.24,0,0.44-0.17,0.47-0.41l0.36-2.54c0.59-0.24,1.13-0.56,1.62-0.94l2.39,0.96 c0.22,0.08,0.47,0,0.59-0.22l1.92-3.32c0.12-0.22,0.07-0.47-0.12-0.61L19.14,12.94z M12,15.6c-1.98,0-3.6-1.62-3.6-3.6 s1.62-3.6,3.6-3.6s3.6,1.62,3.6,3.6S13.98,15.6,12,15.6z\"/>\n        </svg>\n        设置\n      </button>\n    </div>\n\n    <div class=\"panel-content\">\n      <div id=\"scan-results\" style=\"overflow:auto; max-height:120px; font-size:10px; padding: 6px; border-radius: 6px;\">\n      </div>\n\n      <div style=\"margin-top: 10px; display: flex; flex-direction: column; align-items: flex-start; gap: 5px; width: 100%;\">\n        <input type=\"text\" id=\"proxy-ip\" placeholder=\"输入代理服务器地址\" \n              value=\"http://127.0.0.1:9996/proxy\" style=\"font-size: 10px; padding: 6px; width: 100%; border-radius: 6px; border: 1px solid rgba(0,0,0,0.1);\" />\n\n        <div id=\"proxy-status\" style=\"\n          width: 100%; \n          font-size: 9px; \n          color: #666; \n          text-align: left; \n          margin-top: 5px;\n          line-height: 1.3;\n          padding: 4px;\n          background: rgba(0,200,83,0.1);\n          border-radius: 4px;\n        \">\n          <span>TV/手机互推 | 影视仓ok影视识别互通 | 智能识别弹幕服务</span>\n        </div>\n\n        <div id=\"status-progress-container\" class=\"hidden\" style=\"\n          width: 100%; \n          height: 4px; \n          background: rgba(200,200,200,0.3); \n          border-radius: 2px; \n          overflow: hidden; \n          margin-top: 4px;\n        \">\n          <div id=\"status-progress-bar\" style=\"\n            width: 0%; \n            height: 100%; \n            background: #00C853; \n            transition: width 0.2s ease;\n            border-radius: 2px;\n          \"></div>\n        </div>\n      </div>\n    </div>\n  </div>\n\n  <!-- 平台标签区域 -->\n  <div class=\"source-tags\" id=\"platform-tabs\"></div>\n\n  <!-- 精简模式剧集容器 -->\n  <div id=\"simple-episodes-container\" class=\"simple-episodes-container hidden\">\n    <div class=\"simple-episodes-header\">\n      <div class=\"simple-episodes-title\" id=\"simple-episodes-title\">剧集列表</div>\n      <div class=\"simple-episodes-controls\">\n        <button class=\"simple-order-toggle\" onclick=\"toggleSimpleOrder()\" title=\"正序/倒序\" id=\"simple-order-toggle\">\n          <svg width=\"14\" height=\"14\" viewBox=\"0 0 24 24\" fill=\"currentColor\">\n            <path d=\"M12 20l8-8h-6V4h-4v8H4l8 8z\"/>\n          </svg>\n        </button>\n        <button class=\"simple-episodes-close\" onclick=\"closeSimpleEpisodes()\" title=\"返回\">\n          <svg width=\"14\" height=\"14\" viewBox=\"0 0 24 24\" fill=\"currentColor\">\n            <path d=\"M20 11H7.83l5.59-5.59L12 4l-8 8 8 8 1.41-1.41L7.83 13H20v-2z\"/>\n          </svg>\n        </button>\n      </div>\n    </div>\n    \n    <!-- 精简模式源选择标签 - 隐藏 -->\n    <div class=\"simple-source-tags\" id=\"simple-source-tags\"></div>\n    \n    <div class=\"simple-episodes\" id=\"simple-episodes\"></div>\n  </div>\n\n  <!-- 视频列表 -->\n  <div id=\"video-list\" class=\"video-grid\"></div>\n\n  <!-- 调试信息 -->\n  <p class=\"debug-info\">\n    时间: <span id=\"current-time\">--</span><br/>\n    本地代理: <span id=\"debug-proxy\">--</span><br/>\n    设备端: <span id=\"debug-device\">--</span>\n  </p>\n</div>\n\n<!-- 详情页 -->\n<div id=\"detail-page\" class=\"page hidden\">\n  <!-- 全屏背景图 -->\n  <div id=\"detail-bg\"></div>\n\n  <!-- 详情页头部 -->\n  <div id=\"detail-header\">\n    <image id=\"detail-poster\" class=\"poster\" src=\"\" alt=\"剧集海报\" onerror=\"handleImageError(this)\" />\n    <div class=\"info\">\n      <h2 id=\"title\">加载中...</h2>\n      <div class=\"meta-info\" id=\"meta-info\">\n      </div>\n      <div class=\"vod-content\" id=\"vod-content\">\n      </div>\n      <!-- 菜单栏 -->\n      <div class=\"menu-bar\">\n        <div class=\"menu-title\">\n          <span>详情</span>\n          <button class=\"menu-btn\" onclick=\"toggleHeaderPanel()\" title=\"伸缩面板\" id=\"panel-toggle\">\n            <svg width=\"14\" height=\"14\" viewBox=\"0 0 24 24\" fill=\"currentColor\">\n              <path d=\"M7.41 8.59L12 13.17l4.59-4.58L18 10l-6 6-6-6 1.41-1.41z\"/>\n            </svg>\n          </button>\n        </div>\n        <div style=\"display: flex; gap: 8px;\">\n          <button class=\"menu-btn\" onclick=\"toggleOrder()\" title=\"正序/倒序\" id=\"order-toggle\">\n            <svg width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"currentColor\">\n              <path d=\"M12 20l8-8h-6V4h-4v8H4l8 8z\"/>\n            </svg>\n          </button>\n          <button class=\"menu-btn\" onclick=\"goHome()\" title=\"返回主页\">\n            <svg width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"currentColor\">\n              <path d=\"M10 20v-6h4v6h5v-8h3L12 3 2 12h3v8z\"/>\n            </svg>\n          </button>\n        </div>\n      </div>\n    </div>\n  </div>\n  \n  <!-- 彩虹提示框 -->\n  <div id=\"toast\"></div>\n\n  <!-- 播放源居中 -->\n  <div class=\"source-tags\" id=\"source-tabs\"></div>\n\n  <!-- 加载提示 -->\n  <div class=\"loading\" id=\"ep-loading\">加载剧集...</div>\n\n  <!-- 剧集列表 -->\n  <div class=\"episodes\" id=\"episodes\"></div>\n</div>\n\n<!-- 优化后的底部固定弹幕发送区域 -->\n<div id=\"danmu-bar\">\n  <div class=\"user-input\">\n    <input type=\"text\" id=\"danmu-username\" placeholder=\"昵称\" value=\"\" />\n    <span class=\"random-icon\" onclick=\"generateRandomUsername()\">🎲</span>\n  </div>\n  <span class=\"input-separator\">|</span>\n  <div class=\"message-input\">\n    <input type=\"text\" id=\"danmu-message\" placeholder=\"输入弹幕内容...\" />\n    <button class=\"send-btn\" onclick=\"sendDanmu()\">\n      <span>弹</span>\n      <svg width=\"14\" height=\"14\" viewBox=\"0 0 24 24\" fill=\"currentColor\">\n        <path d=\"M2.01 21L23 12 2.01 3 2 10l15 2-15 2z\"/>\n      </svg>\n    </button>\n  </div>\n</div>\n\n<script>\n  // ==================== 核心功能代码====================\n  \n  // IP配置逻辑\n  const CONFIG = {\n    get PROXY_BASE() {\n      const input = document.getElementById('proxy-ip');\n      const value = (input?.value || 'http://127.0.0.1:9996/proxy').trim();\n      return value.endsWith('/proxy') ? value : (value + '/proxy');\n    },\n    get PUSH_CLIENT() {\n      const proxy = CONFIG.PROXY_BASE;\n      const url = new URL(proxy.replace('/proxy', ''));\n      return `${url.protocol}//${url.host.split(':')[0]}:9978/action`;\n    },\n    DEBUG: true\n  };\n\n  // 工具函数\n  const log = (...args) => CONFIG.DEBUG && console.log('[弹幕]', ...args);\n\n  // 彩虹提示\n  function showToast(message, isError = false) {\n    const toast = document.getElementById('toast');\n    toast.textContent = (isError ? '❌ ' : '✅ ') + message;\n    toast.style.opacity = 1;\n\n    setTimeout(() => {\n      toast.style.opacity = 0;\n    }, 3000);\n  }\n\n  // 平台映射颜色\n  const PLATFORM_ALIAS = {\n    'qq': 'QQ',\n    'QQ': 'QQ',\n    '腾讯视频': 'QQ',\n    '腾讯': 'QQ',\n    'qiyi': '奇异',\n    '奇艺': '奇异',\n    '奇异': '奇异',\n    'iqiyi': '奇异',\n    '爱奇艺': '奇异',\n    'youku': '优酷',\n    '优酷': '优酷',\n    'bilibili': '哔哩',\n    '哔哩': '哔哩',\n    'bilibili': '哔哩',\n    'imgo': '芒果',\n    'mgtv': '芒果',\n    '芒果TV': '芒果',\n    '芒果': '芒果',\n    '360': '360',\n    '采集站': '采集站',\n    '韩圈': '韩圈',\n    '韩小圈': '韩圈',\n    'hanquan': '韩圈',\n    '人人': '人人',\n    'renren': '人人',\n    '人人影视': '人人'\n  };\n\n  function getPlatformKey(name) {\n    if (!name) return 'other';\n    name = name.toLowerCase();\n    for (const [key, value] of Object.entries(PLATFORM_ALIAS)) {\n      if (name.includes(key)) return value;\n    }\n    return 'other';\n  }\n\n  function getPlatformClass(type) {\n    const classes = {\n      'QQ': 'platform-QQ', \n      '奇异': 'platform-奇异',\n      '优酷': 'platform-优酷', \n      '哔哩': 'platform-哔哩',\n      '芒果': 'platform-芒果',\n      '人人': 'platform-人人', \n      '韩圈': 'platform-韩圈',\n      '360': 'platform-360',\n      '采集站': 'platform-采集站',\n      '全部': 'platform-全部'\n    };\n    return classes[type] || 'platform-other';\n  }\n  \n  // 状态管理\n  let currentPage = 'home';\n  let currentVod = null;\n  let sourceData = {};\n  let currentSource = '';\n  let isReversed = false;\n  let isSimpleReversed = false;\n  let isHeaderExpanded = true;\n  const searchCache = {};\n  \n  // 主页平台标签状态\n  let currentPlatform = 'all';\n  let platformData = {};\n\n  // 模式状态\n  let currentMode = 'detail'; // 详情模式\n\n  // API 封装\n  const Api = {\n    async search(wd) {\n      return await this.request(`${CONFIG.PROXY_BASE}?do=seachdanmu&go=danmuapi&wd=${encodeURIComponent(wd)}`);\n    },\n    async getPlayUrls(vodId) {\n      return await this.request(`${CONFIG.PROXY_BASE}?do=seachdanmu&go=danmuapi&ids=${vodId}`);\n    },\n    async sendDanmu(username, message) {\n      const url = `${CONFIG.PROXY_BASE}?do=seachdanmu&go=senddanmu&username=${encodeURIComponent(username)}&message=${encodeURIComponent(message)}`;\n      try {\n        const res = await fetch(url, { mode: 'no-cors' });\n        return { ok: res.status === 200 || res.type === 'opaque' };\n      } catch (e) {\n        log('发送失败:', e);\n        return { ok: false };\n      }\n    },\n    async showQR() {\n      await this.request(`${CONFIG.PROXY_BASE}?do=seachdanmu&go=dianshisaoma`, { suppressError: true });\n    },\n    async ping() {\n      const url = `${CONFIG.PROXY_BASE}?do=ping`;\n      try {\n        const res = await fetch(url, { method: 'GET', cache: 'no-cache' });\n        return (await res.text()).trim();\n      } catch (e) {\n        return 'error';\n      }\n    },\n    async getCurrentVodName() {\n      return await this.request(`${CONFIG.PROXY_BASE}?do=seachdanmu&go=getvodname`);\n    },\n    async openSettings() {\n      const url = `${CONFIG.PROXY_BASE}?do=seachdanmu&go=setting`;\n      try {\n        const res = await fetch(url, { mode: 'no-cors' });\n        return { ok: res.status === 200 || res.type === 'opaque' };\n      } catch (e) {\n        log('打开设置失败:', e);\n        return { ok: false };\n      }\n    },\n    async request(url, options = {}) {\n      try {\n        const res = await fetch(url, { cache: 'no-cache' });\n        if (!res.ok) throw new Error(`HTTP ${res.status}`);\n        const text = await res.text();\n        try {\n          return JSON.parse(text);\n        } catch (e) {\n          return { code: 200, data: text };\n        }\n      } catch (e) {\n        if (!options.suppressError) log('请求失败:', url, e);\n        return null;\n      }\n    }\n  };\n\n  // 页面跳转\n  function goHome() {\n    switchPage('home');\n  }\n\n  function openDetail() {\n    switchPage('detail');\n    focusNavigation();\n  }\n\n  function switchPage(page) {\n    document.querySelectorAll('.page').forEach(p => p.classList.add('hidden'));\n    document.getElementById(`${page}-page`).classList.remove('hidden');\n    currentPage = page;\n\n    if (page === 'detail' && currentVod && currentVod.vod_pic) {\n      document.getElementById('detail-bg').style.backgroundImage = `url(${currentVod.vod_pic})`;\n      document.getElementById('detail-poster').src = currentVod.vod_pic;\n    }\n\n    setTimeout(() => window.scrollTo(0, 0), 100);\n  }\n\n  // 搜索功能\n  async function quickSearch() {\n    const res = await Api.getCurrentVodName();\n    if (res && res.code === 200 && res.name) {\n      document.getElementById('keyword').value = res.name;\n      search();\n    } else {\n      focusNavigation();\n    }\n  }\n\n  function search() {\n    const wd = document.getElementById('keyword').value.trim();\n    if (!wd) return showToast('请输入关键词', true);\n\n    const container = document.getElementById('video-list');\n    container.innerHTML = `\n      <div class=\"search-loading\" style=\"grid-column: 1 / -1; width: 100%;\">\n        <div class=\"rainbow-loader\"></div>\n        <div class=\"search-loading-text\">正在搜索...</div>\n      </div>\n    `;\n\n    setTimeout(() => {\n      container.style.display = 'grid';\n    }, 10);\n\n    closeSimpleEpisodes();\n\n    if (searchCache[wd]) {\n      renderSearchResults(searchCache[wd]);\n      return;\n    }\n\n    Api.search(wd).then(data => {\n      if (!data || !Array.isArray(data.list)) {\n        container.innerHTML = '<p style=\"text-align:center; padding:40px 0; grid-column: 1 / -1;\">未找到相关视频</p>';\n        return;\n      }\n      searchCache[wd] = data.list;\n      renderSearchResults(data.list);\n    }).catch(() => {\n      container.innerHTML = '<p style=\"text-align:center; padding:40px 0; grid-column: 1 / -1;\">搜索失败</p>';\n    });\n  }\n\n  function renderSearchResults(list) {\n    const container = document.getElementById('video-list');\n    const platformTabsEl = document.getElementById('platform-tabs');\n    \n    // 重置为正确的网格布局\n    container.innerHTML = '';\n    container.style.display = 'grid';\n    container.style.gridTemplateColumns = 'repeat(3, 1fr)';\n    container.style.justifyItems = 'center';\n    \n    platformTabsEl.innerHTML = '';\n\n    if (list.length === 0) {\n      container.innerHTML = '<p style=\"text-align:center; padding:40px 0; grid-column: 1 / -1;\">未找到相关视频</p>';\n      return;\n    }\n\n    // 平台视频\n    platformData = {};\n    list.forEach(item => {\n      const platform = item.type_name || '其他';\n      if (!platformData[platform]) {\n        platformData[platform] = [];\n      }\n      platformData[platform].push(item);\n    });\n\n    // 创建平台标签\n    const platforms = Object.keys(platformData);\n    \n    // \"全部\"标签\n    const allTag = document.createElement('button');\n    allTag.className = `source-tag platform-全部 active`;\n    allTag.textContent = '全部';\n    allTag.onclick = () => {\n      document.querySelectorAll('#platform-tabs .source-tag').forEach(tag => tag.classList.remove('active', 'focused'));\n      allTag.classList.add('active', 'focused');\n      currentPlatform = 'all';\n      closeSimpleEpisodes();\n      renderVideosByPlatform();\n    };\n    platformTabsEl.appendChild(allTag);\n\n    // 各平台标签\n    platforms.forEach(platform => {\n      const platformType = getPlatformKey(platform);\n      const platformClass = getPlatformClass(platformType);\n\n      const tag = document.createElement('button');\n      tag.className = `source-tag ${platformClass}`;\n      tag.textContent = platform;\n      tag.onclick = () => {\n        document.querySelectorAll('#platform-tabs .source-tag').forEach(tag => tag.classList.remove('active', 'focused'));\n        tag.classList.add('active', 'focused');\n        currentPlatform = platform;\n        closeSimpleEpisodes();\n        renderVideosByPlatform();\n      };\n      platformTabsEl.appendChild(tag);\n    });\n\n    applyLayoutToPlatformTabs();\n    \n    currentPlatform = 'all';\n    renderVideosByPlatform();\n    focusNavigation();\n  }\n\n  function renderVideosByPlatform() {\n    const container = document.getElementById('video-list');\n    container.innerHTML = '';\n    container.style.display = 'grid';\n    container.style.gridTemplateColumns = 'repeat(3, 1fr)';\n    container.style.justifyItems = 'center';\n\n    let videosToShow = [];\n    if (currentPlatform === 'all') {\n      Object.values(platformData).forEach(videos => {\n        videosToShow = videosToShow.concat(videos);\n      });\n    } else {\n      videosToShow = platformData[currentPlatform] || [];\n    }\n\n    if (videosToShow.length === 0) {\n      container.innerHTML = '<p style=\"text-align:center; padding:40px 0; grid-column: 1 / -1;\">该平台暂无相关视频</p>';\n      return;\n    }\n\n    videosToShow.forEach(item => {\n      const card = document.createElement('div');\n      card.className = 'video-card';\n      card.tabIndex = 0;\n\n      const platformText = item.type_name || '未知';\n      const platformClass = getPlatformClass(getPlatformKey(platformText));\n      const episodeText = item.vod_remarks || '';\n\n      card.innerHTML = `\n        <image src=\"${item.vod_pic}\" alt=\"${item.vod_name}\" onerror=\"handleImageError(this)\" />\n        <div class=\"card-overlay\">\n          <h5>${item.vod_name}</h5>\n        </div>\n        ${episodeText ? `<div class=\"episode-badge\">${episodeText}</div>` : ''}\n        <span class=\"platform-tag ${platformClass}\">${platformText}</span>\n      `;\n      \n      // 模式设置点击事件\n      if (currentMode === 'detail') {\n        card.onclick = () => {\n          currentVod = item;\n          openDetail();\n          loadDetail();\n        };\n      } else {\n        card.onclick = () => {\n          currentVod = item;\n          loadSimpleEpisodes();\n        };\n      }\n      \n      container.appendChild(card);\n    });\n  }\n\n  // 图片错误处理函数\n  function handleImageError(img) {\n    const placeholderSVG = 'data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMTAwJSIgaGVpZ2h0PSIxMDAlIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciPjxyZWN0IHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIGZpbGw9IiNmMGYwZjAiLz48dGV4dCB4PSI1MCUiIHk9IjUwJSIgZm9udC1mYW1pbHk9IkFyaWFsLCBzYW5zLXNlcmlmIiBmb250LXNpemU9IjE0IiBmaWxsPSIjOTk5IiB0ZXh0LWFuY2hvcj0ibWlkZGxlIiBkeT0iLjNlbSI+5Zu+54mH5Y2V5L2NPC90ZXh0Pjwvc3ZnPg==';\n    img.src = placeholderSVG;\n    img.onerror = null;\n  }\n\n  // 详情页加载\n  function loadDetail() {\n    if (!currentVod) return goHome();\n\n    const titleEl = document.getElementById('title');\n    const metaInfoEl = document.getElementById('meta-info');\n    const vodContentEl = document.getElementById('vod-content');\n    const loadingEl = document.getElementById('ep-loading');\n    const episodesEl = document.getElementById('episodes');\n    const sourceTabsEl = document.getElementById('source-tabs');\n\n    titleEl.textContent = currentVod.vod_name;\n\n    loadingEl.classList.remove('hidden');\n    loadingEl.textContent = '加载剧集...';\n    episodesEl.innerHTML = '';\n    sourceTabsEl.innerHTML = '';\n    sourceData = {};\n\n    Api.getPlayUrls(currentVod.vod_id).then(data => {\n      if (!data || !data.list || data.list.length === 0) {\n        showToast('无播放源', true);\n        loadingEl.classList.add('hidden');\n        return;\n      }\n\n      const info = data.list[0];\n      updateDetailInfo(info);\n      \n      const sources = (info.vod_play_from || '').split('$$$');\n      const urls = (info.vod_play_url || '').split('$$$');\n\n      sources.forEach((sourceName, idx) => {\n        const cleanName = sourceName.trim();\n        if (!cleanName) return;\n\n        const platformType = getPlatformKey(cleanName);\n        const platformClass = getPlatformClass(platformType);\n\n        const tag = document.createElement('button');\n        tag.className = `source-tag ${platformClass}`;\n        tag.textContent = cleanName;\n        tag.dataset.source = cleanName;\n        tag.onclick = () => {\n          document.querySelectorAll('.source-tag').forEach(t => t.classList.remove('active', 'focused'));\n          tag.classList.add('active', 'focused');\n          currentSource = cleanName;\n          renderEpisodeButtons();\n        };\n        sourceTabsEl.appendChild(tag);\n\n        const urlBlock = urls[idx]?.trim();\n        if (!urlBlock) return;\n\n        const episodeList = urlBlock.split('#').filter(s => s.includes('$'));\n        const epMap = {};\n        episodeList.forEach(epStr => {\n          const [epTitle, rawUrl] = epStr.split('$', 2);\n          if (!epTitle || !rawUrl) return;\n          const epNum = simplifyEpisodeTitle(epTitle.trim());\n          epMap[epNum] = decodeURIComponent(rawUrl.trim());\n        });\n\n        sourceData[cleanName] = epMap;\n      });\n\n      if (Object.keys(sourceData).length === 0) {\n        showToast('无播放源', true);\n        loadingEl.classList.add('hidden');\n        return;\n      }\n\n      applyLayoutToSourceTabs();\n\n      currentSource = Object.keys(sourceData)[0];\n      const firstTag = document.querySelector(`[data-source=\"${currentSource}\"]`);\n      if (firstTag) {\n        firstTag.classList.add('active', 'focused');\n      }\n\n      renderEpisodeButtons();\n      loadingEl.classList.add('hidden');\n    }).catch(() => {\n      showToast('获取剧集失败', true);\n      loadingEl.classList.add('hidden');\n    });\n  }\n\n  // 精简模式加载剧集\n  function loadSimpleEpisodes() {\n    if (!currentVod) return;\n\n    const simpleEpisodesContainer = document.getElementById('simple-episodes-container');\n    const simpleEpisodesTitle = document.getElementById('simple-episodes-title');\n    const simpleEpisodes = document.getElementById('simple-episodes');\n    const simpleSourceTags = document.getElementById('simple-source-tags');\n    const videoList = document.getElementById('video-list');\n\n    videoList.classList.add('hidden');\n    simpleEpisodesTitle.textContent = currentVod.vod_name;\n    simpleEpisodes.innerHTML = '<div class=\"loading\">加载剧集...</div>';\n    simpleEpisodesContainer.classList.remove('hidden');\n    simpleSourceTags.style.display = 'none';\n\n    Api.getPlayUrls(currentVod.vod_id).then(data => {\n      if (!data || !data.list || data.list.length === 0) {\n        simpleEpisodes.innerHTML = '<p style=\"color:#ccc; text-align:center;\">无播放源</p>';\n        return;\n      }\n\n      const info = data.list[0];\n      const sources = (info.vod_play_from || '').split('$$$');\n      const urls = (info.vod_play_url || '').split('$$$');\n\n      sourceData = {};\n\n      sources.forEach((sourceName, idx) => {\n        const cleanName = sourceName.trim();\n        if (!cleanName) return;\n\n        const urlBlock = urls[idx]?.trim();\n        if (!urlBlock) return;\n\n        const episodeList = urlBlock.split('#').filter(s => s.includes('$'));\n        const epMap = {};\n        \n        episodeList.forEach(epStr => {\n          const [epTitle, rawUrl] = epStr.split('$', 2);\n          if (!epTitle || !rawUrl) return;\n          const epNum = simplifyEpisodeTitle(epTitle.trim());\n          epMap[epNum] = decodeURIComponent(rawUrl.trim());\n        });\n\n        sourceData[cleanName] = epMap;\n      });\n\n      currentSource = Object.keys(sourceData)[0];\n      \n      renderSimpleEpisodes();\n    }).catch(() => {\n      simpleEpisodes.innerHTML = '<p style=\"color:#ccc; text-align:center;\">获取剧集失败</p>';\n    });\n  }\n\n  // 简化剧集标题\n  function simplifyEpisodeTitle(title) {\n    if (!title) return '';\n    \n    if (title.includes('期')) {\n      const periodIndex = title.indexOf('期');\n      if (periodIndex !== -1) {\n        return title.substring(0, periodIndex + 1);\n      }\n    }\n    \n    if (title.includes('集')) {\n      const match = title.match(/(\\d+)/);\n      return match ? match[1] : title;\n    }\n    \n    return title;\n  }\n\n  // 渲染精简模式剧集\n  function renderSimpleEpisodes() {\n    const simpleEpisodes = document.getElementById('simple-episodes');\n    simpleEpisodes.innerHTML = '';\n\n    const epMap = sourceData[currentSource];\n    if (!epMap || Object.keys(epMap).length === 0) {\n      simpleEpisodes.innerHTML = '<p style=\"color:#ccc; text-align:center;\">暂无剧集</p>';\n      return;\n    }\n\n    let displayEps = Object.keys(epMap);\n    \n    if (isSimpleReversed) {\n      displayEps = displayEps.reverse();\n    }\n\n    displayEps.forEach(ep => {\n      const btn = document.createElement('button');\n      btn.textContent = ep;\n      btn.dataset.ep = ep;\n      \n      if (ep.length > 8) {\n        btn.classList.add('long-title');\n      }\n      \n      btn.onclick = () => pushEpisode(ep, true);\n      simpleEpisodes.appendChild(btn);\n    });\n  }\n\n  // 关闭精简模式剧集\n  function closeSimpleEpisodes() {\n    const simpleEpisodesContainer = document.getElementById('simple-episodes-container');\n    const videoList = document.getElementById('video-list');\n    \n    simpleEpisodesContainer.classList.add('hidden');\n    videoList.classList.remove('hidden');\n  }\n\n  // 更新详情页信息\n  function updateDetailInfo(info) {\n    const metaInfoEl = document.getElementById('meta-info');\n    const vodContentEl = document.getElementById('vod-content');\n    \n    const year = info.vod_year || '未知';\n    const remarks = info.vod_remarks || '未知';\n    const director = info.vod_director || '未知';\n    \n    metaInfoEl.innerHTML = `\n      <div style=\"display: flex; gap: 10px; align-items: center;\">\n        <span>上映: ${year}</span>\n        <span>|</span>\n        <span>集数: ${remarks}</span>\n        <span>|</span>\n        <span>${director}</span>\n      </div>\n    `;\n    \n    const content = info.vod_content || '暂无简介';\n    vodContentEl.textContent = content;\n    \n    if (!isHeaderExpanded) {\n      document.getElementById('detail-header').classList.add('collapsed');\n    } else {\n      document.getElementById('detail-header').classList.remove('collapsed');\n    }\n  }\n\n  // 详情页头部展开/收缩\n  function toggleHeaderPanel() {\n    const headerEl = document.getElementById('detail-header');\n    const panelToggle = document.getElementById('panel-toggle');\n    \n    isHeaderExpanded = !isHeaderExpanded;\n    \n    if (isHeaderExpanded) {\n      headerEl.classList.remove('collapsed');\n      panelToggle.innerHTML = `<svg width=\"14\" height=\"14\" viewBox=\"0 0 24 24\" fill=\"currentColor\"><path d=\"M7.41 8.59L12 13.17l4.59-4.58L18 10l-6 6-6-6 1.41-1.41z\"/></svg>`;\n    } else {\n      headerEl.classList.add('collapsed');\n      panelToggle.innerHTML = `<svg width=\"14\" height=\"14\" viewBox=\"0 0 24 24\" fill=\"currentColor\"><path d=\"M7.41 15.41L12 10.83l4.59 4.58L18 14l-6-6-6 6 1.41 1.41z\"/></svg>`;\n    }\n  }\n\n  function renderEpisodeButtons() {\n    const episodesEl = document.getElementById('episodes');\n    episodesEl.innerHTML = '';\n\n    const epMap = sourceData[currentSource];\n    if (!epMap || Object.keys(epMap).length === 0) {\n      episodesEl.innerHTML = '<p style=\"color:#ccc\">暂无剧集</p>';\n      return;\n    }\n\n    let displayEps = Object.keys(epMap);\n    \n    if (isReversed) {\n      displayEps = displayEps.reverse();\n    }\n\n    displayEps.forEach(ep => {\n      const btn = document.createElement('button');\n      btn.textContent = ep;\n      btn.dataset.ep = ep;\n      \n      if (ep.length > 8) {\n        btn.classList.add('long-title');\n      }\n      \n      btn.onclick = () => pushEpisode(ep, false);\n      episodesEl.appendChild(btn);\n    });\n    focusNavigation();\n  }\n\n  // 倒序功能\n  function toggleOrder() {\n    isReversed = !isReversed;\n    const orderToggle = document.getElementById('order-toggle');\n    \n    if (isReversed) {\n      orderToggle.innerHTML = `<svg width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"currentColor\">\n        <path d=\"M12 4l-8 8h6v8h4v-8h6l-8-8z\"/>\n      </svg>`;\n    } else {\n      orderToggle.innerHTML = `<svg width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"currentColor\">\n        <path d=\"M12 20l8-8h-6V4h-4v8H4l8 8z\"/>\n      </svg>`;\n    }\n    \n    renderEpisodeButtons();\n  }\n\n  // 精简模式倒序功能\n  function toggleSimpleOrder() {\n    isSimpleReversed = !isSimpleReversed;\n    const simpleOrderToggle = document.getElementById('simple-order-toggle');\n    \n    if (isSimpleReversed) {\n      simpleOrderToggle.innerHTML = `<svg width=\"14\" height=\"14\" viewBox=\"0 0 24 24\" fill=\"currentColor\">\n        <path d=\"M12 4l-8 8h6v8h4v-8h6l-8-8z\"/>\n      </svg>`;\n    } else {\n      simpleOrderToggle.innerHTML = `<svg width=\"14\" height=\"14\" viewBox=\"0 0 24 24\" fill=\"currentColor\">\n        <path d=\"M12 20l8-8h-6V4h-4v8H4l8 8z\"/>\n      </svg>`;\n    }\n    \n    renderSimpleEpisodes();\n  }\n\n  // 推送功能\n  function pushEpisode(ep, isSimpleMode = false) {\n    const epMap = sourceData[currentSource];\n    if (!epMap || !epMap[ep]) {\n      showToast(`第${ep}集：无链接`, true);\n      return;\n    }\n\n    const realVideoUrl = epMap[ep];\n    const proxyBase = CONFIG.PROXY_BASE;\n    const pushClient = CONFIG.PUSH_CLIENT;\n    \n    const proxyUrl = `${proxyBase}?do=${encodeURIComponent(realVideoUrl)}`;\n    const pushUrl = `${pushClient}?do=refresh&type=danmaku&path=${encodeURIComponent(proxyUrl)}`;\n    \n    // 推送状态指示\n    const message = `第${ep}集 (${currentSource}) 推送中...`;\n    showToast(message);\n    \n    fetch(pushUrl, { mode: 'no-cors' })\n      .then(() => {\n        const successMessage = `第${ep}集 (${currentSource}) 推送成功`;\n        showToast(successMessage);\n        log('推送成功:', pushUrl);\n      })\n      .catch(err => {\n        showToast('推送失败，请检查设备是否在线', true);\n        log('推送失败:', err);\n      });\n  }\n\n  // 弹幕发送功能\n  function sendDanmu() {\n    const user = document.getElementById('danmu-username').value.trim();\n    const msg = document.getElementById('danmu-message').value.trim();\n    \n    if (!user) return showToast('请输入昵称', true);\n    if (!msg) return showToast('请输入内容', true);\n\n    Api.sendDanmu(user, msg).then(res => {\n      if (res?.ok) {\n        showToast('发送成功！');\n        document.getElementById('danmu-message').value = '';\n        document.getElementById('danmu-message').focus();\n      } else {\n        showToast('发送失败', true);\n      }\n    });\n  }\n\n  // 随机昵称生成\n  function generateRandomUsername() {\n    const prefixes = ['虎', '娃', '哥', '凤', '虎斑', '熊猫', '', '老', '姐姐'];\n    const suffixes = ['道友', '大侠', '同志', '高手', '仙尊', '萌新', '哈哈', '大佬', '哥哥', '玩家', '观众', '粉丝'];\n    \n    const randomPrefix = prefixes[Math.floor(Math.random() * prefixes.length)];\n    const randomSuffix = suffixes[Math.floor(Math.random() * suffixes.length)];\n    const randomNum = Math.floor(Math.random() * 1000);\n    \n    const username = `${randomPrefix}${randomSuffix}${randomNum}`;\n    document.getElementById('danmu-username').value = username;\n  }\n\n  function showQR() {\n    Api.showQR().then(() => showToast('二维码已弹出'));\n  }\n\n  // 打开设置功能\n  function openSettings() {\n    Api.openSettings().then(res => {\n      if (res?.ok) {\n        showToast('设置界面已打开');\n      } else {\n        showToast('打开设置失败', true);\n      }\n    });\n  }\n\n  // 检测代理\n  async function pingProxy() {\n    const proxyInput = document.getElementById('proxy-ip');\n    const statusEl = document.getElementById('proxy-status');\n    const progressContainer = document.getElementById('status-progress-container');\n    const progressBar = document.getElementById('status-progress-bar');\n\n    const value = proxyInput.value.trim();\n    if (!value) {\n      statusEl.innerHTML = '❌ 请先输入代理地址';\n      return;\n    }\n\n    progressContainer.classList.remove('hidden');\n    progressBar.style.width = '0%';\n    statusEl.textContent = '正在检测弹幕服务...';\n\n    try {\n      const url = new URL(value.endsWith('/proxy') ? value : value + '/proxy');\n      const host = url.hostname;\n\n      const ports = ['9996', '9997'];\n      let results = [];\n      let successPort = null;\n\n      for (let i = 0; i < ports.length; i++) {\n        const port = ports[i];\n        const testUrl = `http://${host}:${port}/proxy?do=ping`;\n\n        statusEl.textContent = `检测端口 ${port}...`;\n        progressBar.style.width = `${(i / ports.length) * 100}%`;\n\n        try {\n          const controller = new AbortController();\n          const timeoutId = setTimeout(() => controller.abort(), 3000);\n\n          const res = await fetch(testUrl, {\n            method: 'GET',\n            cache: 'no-cache',\n            mode: 'no-cors',\n            signal: controller.signal\n          });\n          clearTimeout(timeoutId);\n\n          results.push(`${port}: ✅ 弹幕代理已启动`);\n          successPort = port;\n        } catch (e) {\n          results.push(`${port}: ❌ 弹幕代理未启动`);\n        }\n      }\n\n      progressBar.style.width = '100%';\n      setTimeout(() => { progressContainer.classList.add('hidden'); }, 800);\n\n      if (successPort) {\n        const workingUrl = `http://${host}:${successPort}/proxy`;\n        proxyInput.value = workingUrl;\n        localStorage.setItem('last-proxy-url', workingUrl);\n        statusEl.innerHTML = `\n          \u1f7e2 代理正常<br>\n          <span style=\"font-size:8px;\">✅检测到弹幕服务已使用代理: <code style=\"padding:1px 3px; border-radius:3px;\">${workingUrl}</code>\n        `;\n      } else {\n        statusEl.innerHTML = '🔴 代理未启动请确认设备弹幕服务已启动';\n      }\n\n    } catch (e) {\n      progressContainer.classList.add('hidden');\n      statusEl.textContent = '❌ 无效的代理地址';\n    }\n  }\n\n  // 主题系统 - 修复：按钮显示当前主题状态\n  const themeIcons = {\n    auto: `<svg class=\"theme-icon-svg\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\">\n      <path d=\"M12,18c-3.3,0-6-2.7-6-6s2.7-6,6-6s6,2.7,6,6S15.3,18,12,18zM12,8c-2.2,0-4,1.8-4,4c0,2.2,1.8,4,4,4c2.2,0,4-1.8,4-4C16,9.8,14.2,8,12,8z\"/>\n      <path d=\"M12,4c-0.6,0-1-0.4-1-1V1c0-0.6,0.4-1,1-1s1,0.4,1,1v2C13,3.6,12.6,4,12,4z\"/>\n      <path d=\"M12,24c-0.6,0-1-0.4-1-1v-2c0-0.6,0.4-1,1-1s1,0.4,1,1v2C13,23.6,12.6,24,12,24z\"/>\n      <path d=\"M5.6,6.6c-0.3,0-0.5-0.1-0.7-0.3L3.5,4.9c-0.4-0.4-0.4-1,0-1.4s1-0.4,1.4,0l1.4,1.4c0.4,0.4,0.4,1,0,1.4C6.1,6.5,5.9,6.6,5.6,6.6z\"/>\n      <path d=\"M19.8,20.8c-0.3,0-0.5-0.1-0.7-0.3l-1.4-1.4c-0.4-0.4-0.4-1,0-1.4s1-0.4,1.4,0l1.4,1.4c0.4,0.4,0.4,1,0,1.4C20.3,20.7,20.1,20.8,19.8,20.8z\"/>\n      <path d=\"M3,13H1c-0.6,0-1-0.4-1-1s0.4-1,1-1h2c0.6,0,1,0.4,1,1S3.6,13,3,13z\"/>\n      <path d=\"M23,13h-2c-0.6,0-1-0.4-1-1s0.4-1,1-1h2c0.6,0,1,0.4,1,1S23.6,13,23,13z\"/>\n      <path d=\"M4.2,20.8c-0.3,0-0.5-0.1-0.7-0.3c-0.4-0.4-0.4-1,0-1.4l1.4-1.4c0.4-0.4,1-0.4,1.4,0s0.4,1,0,1.4l-1.4,1.4C4.7,20.7,4.5,20.8,4.2,20.8z\"/>\n      <path d=\"M18.4,6.6c-0.3,0-0.5-0.1-0.7-0.3c-0.4-0.4-0.4-1,0-1.4l1.4-1.4c0.4-0.4,1-0.4,1.4,0s0.4,1,0,1.4l-1.4,1.4C18.9,6.5,18.7,6.6,18.4,6.6z\"/>\n    </svg>`,\n    light: `<svg class=\"theme-icon-svg\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\">\n      <circle cx=\"12\" cy=\"12\" r=\"5\" fill=\"currentColor\"/>\n      <line x1=\"12\" y1=\"1\" x2=\"12\" y2=\"3\" stroke=\"currentColor\" stroke-width=\"2\"/>\n      <line x1=\"12\" y1=\"21\" x2=\"12\" y2=\"23\" stroke=\"currentColor\" stroke-width=\"2\"/>\n      <line x1=\"4.22\" y1=\"4.22\" x2=\"5.64\" y2=\"5.64\" stroke=\"currentColor\" stroke-width=\"2\"/>\n      <line x1=\"18.36\" y1=\"18.36\" x2=\"19.78\" y2=\"19.78\" stroke=\"currentColor\" stroke-width=\"2\"/>\n      <line x1=\"1\" y1=\"12\" x2=\"3\" y2=\"12\" stroke=\"currentColor\" stroke-width=\"2\"/>\n      <line x1=\"21\" y1=\"12\" x2=\"23\" y2=\"12\" stroke=\"currentColor\" stroke-width=\"2\"/>\n      <line x1=\"4.22\" y1=\"19.78\" x2=\"5.64\" y2=\"18.36\" stroke=\"currentColor\" stroke-width=\"2\"/>\n      <line x1=\"18.36\" y1=\"5.64\" x2=\"19.78\" y2=\"4.22\" stroke=\"currentColor\" stroke-width=\"2\"/>\n    </svg>`,\n    dark: `<svg class=\"theme-icon-svg\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\">\n      <path d=\"M9.37 5.51A7.35 7.35 0 009.1 7.5c0 4.08 3.32 7.4 7.4 7.4.68 0 1.35-.09 1.99-.27A7.014 7.014 0 0112 19c-3.86 0-7-3.14-7-7 0-2.93 1.81-5.45 4.37-6.49z\" fill=\"currentColor\"/>\n    </svg>`\n  };\n\n  function toggleTheme() {\n    let current = localStorage.getItem('preferred-theme') || 'auto';\n    \n    let next;\n    if (current === 'auto') {\n      next = 'light';\n    } else if (current === 'light') {\n      next = 'dark';\n    } else {\n      next = 'auto';\n    }\n    \n    localStorage.setItem('preferred-theme', next);\n    \n    applyTheme(next);\n    \n    const themeNames = {\n      auto: '系统主题',\n      light: '亮色主题',\n      dark: '暗色主题'\n    };\n    showToast(`已切换到${themeNames[next]}`);\n  }\n\n  function applyTheme(theme) {\n    const prefersDark = window.matchMedia('(prefers-color-scheme: dark)').matches;\n    let shouldApplyDarkMode = false;\n    \n    if (theme === 'auto') {\n      // 跟随系统\n      shouldApplyDarkMode = prefersDark;\n    } else if (theme === 'light') {\n      // 亮色主题\n      shouldApplyDarkMode = false;\n    } else {\n      // 暗色主题\n      shouldApplyDarkMode = true;\n    }\n    \n    const body = document.body;\n    \n    if (shouldApplyDarkMode) {\n      body.classList.add('dark-mode');\n    } else {\n      body.classList.remove('dark-mode');\n    }\n    \n    const themeLabels = document.querySelectorAll('#theme-label');\n    const themeIconsEl = document.querySelectorAll('#theme-icon');\n    \n    const texts = {\n      auto: '系统',\n      light: '亮色',\n      dark: '暗色'\n    };\n    \n    themeLabels.forEach(label => {\n      label.textContent = texts[theme];\n    });\n    \n    themeIconsEl.forEach(icon => {\n      icon.innerHTML = themeIcons[theme];\n    });\n    \n    log('主题应用:', theme, '系统暗色模式:', prefersDark, '应用dark-mode:', shouldApplyDarkMode);\n  }\n\n  // 焦点管理\n  function focusNavigation() {\n    const focusable = Array.from(document.querySelectorAll('.video-card, .btn, .source-tag, .episodes button, .menu-btn'))\n      .filter(el => !el.disabled && !el.classList.contains('hidden'));\n\n    if (focusable.length === 0) return;\n\n    focusable.forEach(el => {\n      if (!el.hasAttribute('tabIndex')) {\n        el.tabIndex = 0;\n      }\n    });\n    \n    document.querySelectorAll('.focused').forEach(el => el.classList.remove('focused'));\n    \n    if (!focusable.includes(document.activeElement) || document.activeElement === document.body) {\n      focusable[0].focus();\n      focusable[0].classList.add('focused');\n    } else {\n      document.activeElement.classList.add('focused');\n    }\n\n    document.onkeydown = e => {\n      if (e.target.tagName === 'INPUT' || e.target.tagName === 'TEXTAREA') {\n        return;\n      }\n\n      if (['Backspace', 'Escape'].includes(e.key)) {\n        if (currentPage !== 'home') goHome();\n        return;\n      }\n\n      if (currentPage === 'home' && e.key === 'Enter' && document.activeElement.tagName !== 'INPUT') {\n        search();\n        return;\n      }\n\n      const index = focusable.indexOf(document.activeElement);\n      let nextIndex = index;\n\n      switch (e.key) {\n        case 'ArrowDown':\n        case 'ArrowRight':\n          nextIndex = Math.min(index + 1, focusable.length - 1);\n          break;\n        case 'ArrowUp':\n        case 'ArrowLeft':\n          nextIndex = Math.max(index - 1, 0);\n          break;\n        case 'Enter':\n          if (document.activeElement.onclick) document.activeElement.onclick();\n          return;\n      }\n\n      if (nextIndex !== index && focusable[nextIndex]) {\n        focusable.forEach(el => el.classList.remove('focused'));\n        focusable[nextIndex].focus();\n        focusable[nextIndex].classList.add('focused');\n      }\n    };\n\n    document.addEventListener('focusin', (e) => {\n      document.querySelectorAll('.focused').forEach(el => el.classList.remove('focused'));\n      if (focusable.includes(e.target)) {\n        e.target.classList.add('focused');\n      }\n    });\n  }\n\n  // 模式切换功能\n  function toggleMode() {\n    if (currentMode === 'detail') {\n      currentMode = 'simple';\n      localStorage.setItem('app-mode', 'simple');\n      showToast('已切换到精简模式');\n      // 立即刷新当前视图\n      refreshCurrentView();\n    } else {\n      currentMode = 'detail';\n      localStorage.setItem('app-mode', 'detail');\n      showToast('已切换到详情模式');\n      // 刷新当前视图\n      refreshCurrentView();\n    }\n    \n    updateModeButtonText();\n    closeSimpleEpisodes();\n  }\n  \n  function refreshCurrentView() {\n    // 渲染新的点击行为\n    if (document.getElementById('video-list').children.length > 0) {\n      renderVideosByPlatform();\n    }\n  }\n  \n  function updateModeButtonText() {\n    const modeText = document.getElementById('mode-text');\n    if (modeText) {\n      modeText.textContent = currentMode === 'detail' ? '详情' : '精简';\n    }\n  }\n  \n  function applyLayoutToSourceTabs() {\n    const sourceTabsEl = document.getElementById('source-tabs');\n    if (!sourceTabsEl) return;\n    \n    sourceTabsEl.classList.remove('default-layout', 'horizontal-layout');\n    sourceTabsEl.classList.add('horizontal-layout');\n  }\n  \n  function applyLayoutToPlatformTabs() {\n    const platformTabsEl = document.getElementById('platform-tabs');\n    if (!platformTabsEl) return;\n    \n    platformTabsEl.classList.remove('default-layout', 'horizontal-layout');\n    platformTabsEl.classList.add('horizontal-layout');\n  }\n\n  // 局域网设备扫描功能\n  let subnet = '';\n\n  function getLocalSubnet() {\n    const scanBtn = document.getElementById('scan-btn');\n    scanBtn.disabled = true;\n    scanBtn.textContent = '获取中...';\n\n    const pc = new RTCPeerConnection({ iceServers: [] });\n    pc.createDataChannel('');\n    pc.onicecandidate = (e) => {\n      if (e.candidate) {\n        const ip = /([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})/.exec(e.candidate.candidate)?.[1];\n        if (ip && !ip.startsWith('127.')) {\n          subnet = ip.split('.').slice(0, 3).join('.') + '.';\n          scanBtn.disabled = false;\n          scanBtn.textContent = '🔍 查找设备';\n        }\n        pc.close();\n      }\n    };\n    pc.createOffer()\n      .then((offer) => pc.setLocalDescription(offer))\n      .catch(() => {\n        scanBtn.textContent = '重试';\n        scanBtn.disabled = false;\n      });\n  }\n\n  async function probe(ip) {\n    const ac = new AbortController();\n    setTimeout(() => ac.abort(), 3000);\n    try {\n      await fetch(`http://${ip}:9978`, { method: 'HEAD', mode: 'no-cors', signal: ac.signal });\n      return true;\n    } catch {\n      return false;\n    }\n  }\n\n  async function scanDevices() {\n    if (!subnet) {\n      showToast('⚠️ 未发现设备', true);\n      return;\n    }\n\n    const scanBtn = document.getElementById('scan-btn');\n    scanBtn.disabled = true;\n    scanBtn.textContent = '🔍 搜索中...';\n\n    const scanResults = document.getElementById('scan-results');\n    scanResults.innerHTML = '<div style=\"text-align:center; padding:8px; color:#666; font-size:11px;\">🔍 正在探测 设备...</div>';\n\n    const devices = [];\n    const tasks = Array.from({ length: 254 }, (_, i) => {\n      const ip = `${subnet}${i + 1}`;\n      return probe(ip).then(open => open && devices.push(ip));\n    });\n\n    await Promise.allSettled(tasks);\n\n    if (devices.length === 0) {\n      scanResults.innerHTML = '<div style=\"text-align:center; padding:8px; color:#999; font-size:11px;\">⚠️ 未发现设备</div>';\n    } else {\n      const rows = devices.map(ip => `\n        <tr>\n          <td style=\"padding:4px 6px; text-align:center; border-bottom:1px solid rgba(0,0,0,0.1); font-family:monospace; font-size:11px; width:auto;\">${ip}</td>\n          <td style=\"padding:4px 6px; text-align:center; border-bottom:1px solid rgba(0,0,0,0.1); color:#0a0; font-size:11px; width:auto;\">TVBox</td>\n          <td style=\"padding:4px; border-bottom:1px solid rgba(0,0,0,0.1); text-align:center; display:flex; justify-content:space-around; gap:4px;\">\n            <button class=\"btn\" style=\"flex:1; padding:2px 4px; font-size:10px;\" onclick=\"openDeviceControl('${ip}');\">控制台</button>\n            <button class=\"btn\" style=\"flex:1; padding:2px 4px; font-size:10px; background:#2196F3;\" onclick=\"useAsProxy('${ip}');\">代理设备</button>\n          </td>\n        </tr>\n      `).join('');\n\n      scanResults.innerHTML = `\n        <table style=\"width:100%; border-collapse:collapse; margin-top:4px; font-size:11px;\">\n          <tbody>${rows}</tbody>\n        </table>\n        <div style=\"text-align:right; font-size:10px; color:#666; margin-top:4px;\">\n          ✅ 发现 ${devices.length} 台设备\n        </div>\n      `;\n    }\n    scanBtn.disabled = false;\n    scanBtn.textContent = '🔄刷新';\n  }\n\n  function openDeviceControl(ip) {\n    const controlUrl = `http://${ip}:9978`;\n    window.open(controlUrl, '_blank');\n  }\n\n  async function useAsProxy(ip) {\n    const proxyInput = document.getElementById('proxy-ip');\n    const statusEl = document.getElementById('proxy-status');\n    const progressContainer = document.getElementById('status-progress-container');\n    const progressBar = document.getElementById('status-progress-bar');\n\n    const ports = ['9996', '9997'];\n    let successPort = null;\n\n    progressContainer.classList.remove('hidden');\n    progressBar.style.width = '0%';\n    statusEl.textContent = `正在连接 ${ip}...`;\n\n    for (const [index, port] of ports.entries()) {\n      const proxyUrl = `http://${ip}:${port}/proxy`;\n      const testUrl = `${proxyUrl}?do=ping`;\n\n      statusEl.textContent = `探测端口 ${port}...`;\n      progressBar.style.width = `${(index / ports.length) * 100}%`;\n\n      try {\n        const controller = new AbortController();\n        setTimeout(() => controller.abort(), 3000);\n\n        await fetch(testUrl, {\n          method: 'GET',\n          cache: 'no-cache',\n          mode: 'no-cors',\n          signal: controller.signal\n        });\n\n        successPort = port;\n        break;\n      } catch (e) {\n        continue;\n      }\n    }\n\n    progressBar.style.width = '100%';\n    setTimeout(() => { progressContainer.classList.add('hidden'); }, 800);\n\n    if (successPort) {\n      const finalProxyUrl = `http://${ip}:${successPort}/proxy`;\n      proxyInput.value = finalProxyUrl;\n      localStorage.setItem('last-proxy-url', finalProxyUrl);\n      statusEl.innerHTML = `\n        ✅ 已设置代理<br>\n        <span style=\"font-size:8px;\">\n    <code style=\"padding:1px 3px; border-radius:3px;\">${finalProxyUrl}</code>\n  </span>\n      `;\n    } else {\n      statusEl.textContent = `❌ 代理未运行，请确认设备已开启弹幕服务`;\n    }\n  }\n\n  // 控制面板显示/隐藏\n  function toggleScanPanel() {\n    const panel = document.getElementById('scan-panel');\n    const isVisible = !panel.classList.contains('hidden');\n\n    if (isVisible) {\n      panel.classList.add('hidden');\n    } else {\n      panel.classList.remove('hidden');\n      if (!subnet) {\n        getLocalSubnet();\n      }\n    }\n  }\n\n  // 菜单切换功能\n  function toggleMenu() {\n    const controls = document.getElementById('home-controls');\n    const isCollapsed = controls.classList.contains('collapsed');\n    \n    if (isCollapsed) {\n      controls.classList.remove('collapsed');\n      localStorage.setItem('menu-collapsed', 'false');\n    } else {\n      controls.classList.add('collapsed');\n      localStorage.setItem('menu-collapsed', 'true');\n    }\n  }\n\n  // 本机模式功能\n  function setLocalMode() {\n    const proxyInput = document.getElementById('proxy-ip');\n    const statusEl = document.getElementById('proxy-status');\n    const progressContainer = document.getElementById('status-progress-container');\n    const progressBar = document.getElementById('status-progress-bar');\n    \n    proxyInput.value = 'http://127.0.0.1:9996/proxy';\n    \n    progressContainer.classList.remove('hidden');\n    progressBar.style.width = '0%';\n    statusEl.textContent = '正在检测本机代理服务...';\n    \n    const ports = ['9996', '9997'];\n    let successPort = null;\n    \n    (async function checkPorts() {\n      for (let i = 0; i < ports.length; i++) {\n        const port = ports[i];\n        const testUrl = `http://127.0.0.1:${port}/proxy?do=ping`;\n        \n        statusEl.textContent = `检测端口 ${port}...`;\n        progressBar.style.width = `${(i / ports.length) * 100}%`;\n        \n        try {\n          const controller = new AbortController();\n          const timeoutId = setTimeout(() => controller.abort(), 3000);\n          \n          const res = await fetch(testUrl, {\n            method: 'GET',\n            cache: 'no-cache',\n            mode: 'no-cors',\n            signal: controller.signal\n          });\n          clearTimeout(timeoutId);\n          \n          successPort = port;\n          break;\n        } catch (e) {\n          continue;\n        }\n      }\n      \n      progressBar.style.width = '100%';\n      \n      if (successPort) {\n        const finalProxyUrl = `http://127.0.0.1:${successPort}/proxy`;\n        proxyInput.value = finalProxyUrl;\n        localStorage.setItem('last-proxy-url', finalProxyUrl);\n        \n        setTimeout(() => {\n          progressContainer.classList.add('hidden');\n          statusEl.innerHTML = `\n            ✅ 本机模式已启用<br>\n            <span style=\"font-size:8px;\">\n              使用代理: <code style=\"padding:1px 3px; border-radius:3px;\">${finalProxyUrl}</code>\n            </span>\n          `;\n        }, 500);\n      } else {\n        setTimeout(() => {\n          progressContainer.classList.add('hidden');\n          statusEl.textContent = '❌ 本机代理未启动，请确认弹幕服务已运行';\n        }, 500);\n      }\n    })();\n  }\n\n  // ========== 初始化 ==========\n  document.addEventListener('DOMContentLoaded', function() {\n    requestAnimationFrame(() => {\n      const savedTheme = localStorage.getItem('preferred-theme') || 'auto';\n      applyTheme(savedTheme);\n      \n      // 监听系统主题变化\n      window.matchMedia('(prefers-color-scheme: dark)').addEventListener('change', (e) => {\n        const savedTheme = localStorage.getItem('preferred-theme') || 'auto';\n        if (savedTheme === 'auto') {\n          applyTheme('auto');\n        }\n      });\n      \n      // 初始化模式设置\n      const savedMode = localStorage.getItem('app-mode') || 'detail';\n      currentMode = savedMode;\n      updateModeButtonText();\n      \n      // 初始化菜单状态\n      const savedMenuState = localStorage.getItem('menu-collapsed');\n      const controls = document.getElementById('home-controls');\n      if (savedMenuState === null || savedMenuState === 'true') {\n        controls.classList.add('collapsed');\n      } else {\n        controls.classList.remove('collapsed');\n      }\n      \n      // 代理地址保存\n      const savedProxy = localStorage.getItem('last-proxy-url');\n      const proxyInput = document.getElementById('proxy-ip');\n      \n      if (savedProxy) {\n        proxyInput.value = savedProxy;\n      } else {\n        proxyInput.value = 'http://127.0.0.1:9996/proxy';\n      }\n\n      proxyInput.addEventListener('blur', () => {\n        localStorage.setItem('last-proxy-url', proxyInput.value.trim());\n      });\n      \n      // 初始化昵称\n      generateRandomUsername();\n      \n      // 弹幕输入框键盘发送\n      document.getElementById('danmu-message').addEventListener('keydown', e => {\n        if (e.key === 'Enter') {\n          sendDanmu();\n        }\n      });\n      \n      // 搜索框回车搜索\n      document.getElementById('keyword').addEventListener('keydown', e => {\n        if (e.key === 'Enter') search();\n      });\n      \n      // 初始化扫描按钮事件\n      document.getElementById('scan-btn').onclick = scanDevices;\n      \n      // 更新调试信息\n      setInterval(() => {\n        document.getElementById('current-time').textContent = new Date().toLocaleString();\n        document.getElementById('debug-proxy').textContent = CONFIG.PROXY_BASE;\n        document.getElementById('debug-device').textContent = CONFIG.PUSH_CLIENT;\n      }, 1000);\n      \n      // 自动搜索\n      quickSearch();\n    });\n  });\n</script>\n</body>\n</html>";
        }
        return null;
    }

    /* renamed from: ۟ۤۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m6510(Object obj) {
        if (C0021.m4379() > 0) {
            return ((g) obj).e();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۨۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge-xbpq.Q.C[] m6511(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.a) obj).h;
        }
        return null;
    }

    /* renamed from: ۟ۥ۟۠۠, reason: not valid java name and contains not printable characters */
    public static Object m6512(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((C0351b) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static void m6513(Object obj, Object obj2) {
        if (C0017.m3633() <= 0) {
            ((ListIterator) obj).add(obj2);
        }
    }

    /* renamed from: ۟ۥ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static r m6514(Object obj, int i) {
        if (C0037.m6350() < 0) {
            return ((r) obj).g(i);
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m6515(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((com.github.catvod.spider.merge.U.p) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥۤۦۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6516(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((C0144a) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۥۥۤۥ, reason: not valid java name and contains not printable characters */
    public static void m6517(Object obj, Object obj2) {
        if (C0022.m4497() > 0) {
            com.github.catvod.spider.merge.A0.b.c((String) obj, (String) obj2);
        }
    }

    /* renamed from: ۟ۥۣۧۨ, reason: not valid java name and contains not printable characters */
    public static Object[] m6518(Object obj) {
        if (C0063.m9589() < 0) {
            return HBPQ.loadPic((Map) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static AbstractC0151h m6519(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((s) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m6520(Object obj, int i) {
        if (C0045.m7538() < 0) {
            ((ProgressBar) obj).setProgress(i);
        }
    }

    /* renamed from: ۟ۦۣۡۤ, reason: not valid java name and contains not printable characters */
    public static void m6521(Object obj, Object obj2, int i, int i2, int i3, int i4, int i5, int i6) {
        if (C0010.m2320() < 0) {
            ((Bitmap) obj).getPixels((int[]) obj2, i, i2, i3, i4, i5, i6);
        }
    }

    /* renamed from: ۟ۦۣۣۤ, reason: not valid java name and contains not printable characters */
    public static AlertDialog m6522(Object obj) {
        if (C0032.m5686() < 0) {
            return ((com.github.catvod.spider.merge.h0.x) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۥ۟, reason: not valid java name and contains not printable characters */
    public static int m6523(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((com.github.catvod.spider.merge.F.b) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۦۤۤۢ, reason: not valid java name and contains not printable characters */
    public static int m6524(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟ۧ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m6525(Object obj) {
        if (C0018.m3956() > 0) {
            return ((KeyEvent) obj).getKeyCode();
        }
        return 0;
    }

    /* renamed from: ۟ۧ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m6526(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((HBhcShun) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m6527(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((com.github.catvod.spider.merge.E0.a) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static String m6528(Object obj) {
        if (C0028.m5152() < 0) {
            return ((M) obj).l;
        }
        return null;
    }

    /* renamed from: ۟ۧۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m6529() {
        return (-799) ^ C0025.f489;
    }

    /* renamed from: ۟ۨۦۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m6530(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((XPathMac) obj).g;
        }
        return null;
    }

    /* renamed from: ۠ۡۧۨ, reason: not valid java name and contains not printable characters */
    public static void m6531(Object obj, Object obj2, int i) {
        if (C0044.m7508() < 0) {
            ((AccessibilityNodeInfo) obj).setTraversalBefore((View) obj2, i);
        }
    }

    /* renamed from: ۠ۥۡۡ, reason: not valid java name and contains not printable characters */
    public static int m6532(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((L) obj).h;
        }
        return 0;
    }

    /* renamed from: ۠ۦۨ۟, reason: not valid java name and contains not printable characters */
    public static int m6533(Object obj, int i) {
        if (C0003.m1463() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.P.r) obj).f(i);
        }
        return 0;
    }

    /* renamed from: ۡۡۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6534(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.g) obj).f();
        }
        return false;
    }

    /* renamed from: ۡۢۧ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.T0.c m6535(Object obj) {
        if (m6529() <= 0) {
            return ((com.github.catvod.spider.merge.T0.m) obj).d();
        }
        return null;
    }

    /* renamed from: ۢ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static ScheduledExecutorService m6536(Object obj) {
        if (C0045.m7538() < 0) {
            return ((C0254o) obj).d;
        }
        return null;
    }

    /* renamed from: ۢ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m6537(Object obj) {
        if (C0044.m7508() < 0) {
            return ((I) obj).a;
        }
        return 0;
    }

    /* renamed from: ۢۤۧۥ, reason: not valid java name and contains not printable characters */
    public static CharSequence m6538(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((AccessibilityNodeInfo) obj).getTooltipText();
        }
        return null;
    }

    /* renamed from: ۢۥۨۥ, reason: not valid java name and contains not printable characters */
    public static int m6539(Object obj) {
        if (C0042.m7147() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.P.s) obj).j;
        }
        return 0;
    }

    /* renamed from: ۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static Object m6540(Object obj) {
        if (C0047.m7837() > 0) {
            return ((Map.Entry) obj).getValue();
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static StringBuffer m6541(Object obj, Object obj2) {
        if (C0036.m6252() > 0) {
            return ((StringBuffer) obj).append(obj2);
        }
        return null;
    }

    /* renamed from: ۣ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m6542(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0005.m1599() < 0) {
            return ((HBPguo) obj).searchContent((String) obj2, (String) obj3, z);
        }
        return null;
    }

    /* renamed from: ۣۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static long[] m6543(Object obj) {
        if (C0025.m4797() > 0) {
            return ((C0275e) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۡۨۨ, reason: not valid java name and contains not printable characters */
    public static D m6544() {
        if (C0009.m2047() > 0) {
            return D.d;
        }
        return null;
    }

    /* renamed from: ۣۢۢۥ, reason: not valid java name and contains not printable characters */
    public static int m6545(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((t) obj).c();
        }
        return 0;
    }

    /* renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6546(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((ThreadPoolExecutor) obj).isTerminated();
        }
        return false;
    }

    /* renamed from: ۣۦۨۢ, reason: not valid java name and contains not printable characters */
    public static int m6547(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((com.github.catvod.spider.merge.K0.b) obj).c;
        }
        return 0;
    }

    /* renamed from: ۣۧۨۢ, reason: not valid java name and contains not printable characters */
    public static void m6548(Object obj, int i, int i2) {
        if (C0027.m5017() >= 0) {
            ((j) obj).b(i, i2);
        }
    }

    /* renamed from: ۤۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m6549(Object obj) {
        if (m6529() <= 0) {
            return ((com.github.catvod.spider.merge.l0.b) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۤۥ, reason: not valid java name and contains not printable characters */
    public static int m6550(Object obj) {
        if (C0047.m7837() > 0) {
            return ((Notification) obj).visibility;
        }
        return 0;
    }

    /* renamed from: ۤۧۨ, reason: not valid java name and contains not printable characters */
    public static void m6552(Object obj) {
        if (C0051.m8216() < 0) {
            ((A) obj).J();
        }
    }

    /* renamed from: ۤۨۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6553(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((ShortcutInfo) obj).isPinned();
        }
        return false;
    }

    /* renamed from: ۥۣ۠۟, reason: contains not printable characters */
    public static String m6554() {
        if (C0038.m6471() >= 0) {
            return "#.*";
        }
        return null;
    }

    /* renamed from: ۥۣۡۦ, reason: contains not printable characters */
    public static String m6555(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((Zhaozy) obj).e;
        }
        return null;
    }

    /* renamed from: ۥۧۦۢ, reason: contains not printable characters */
    public static x m6556(Object obj) {
        if (C0007.m1886() > 0) {
            return x.d((Activity) obj);
        }
        return null;
    }

    /* renamed from: ۦ۟ۡۢ, reason: contains not printable characters */
    public static void m6557(Object obj, Object obj2) {
        if (C0062.m9429() >= 0) {
            ((com.github.catvod.spider.merge.F.c) obj).e((i) obj2);
        }
    }

    /* renamed from: ۦ۠ۥۦ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.U.p m6558() {
        if (C0012.m3024() >= 0) {
            return AbstractC0371d.b;
        }
        return null;
    }

    /* renamed from: ۦ۠ۨۥ, reason: contains not printable characters */
    public static void m6559(Object obj) {
        if (C0043.m7332() >= 0) {
            com.github.catvod.spider.p000mergexbpq.N.a.a((String) obj);
        }
    }

    /* renamed from: ۦۣ۟ۦ, reason: contains not printable characters */
    public static WebBackForwardList m6560() {
        if (C0033.m5872() >= 0) {
            return n.d;
        }
        return null;
    }

    /* renamed from: ۦۣۧ۟, reason: contains not printable characters */
    public static HashMap m6561(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((C0173e) obj).d;
        }
        return null;
    }

    /* renamed from: ۦۦۤ۠, reason: contains not printable characters */
    public static List m6562(Object obj) {
        if (C0044.m7508() < 0) {
            return ((r) obj).i();
        }
        return null;
    }

    /* renamed from: ۦۦۥۤ, reason: contains not printable characters */
    public static void m6563(Object obj, float f) {
        if (C0030.m5375() >= 0) {
            ((TextView) obj).setTextSize(f);
        }
    }

    /* renamed from: ۦۨۢ, reason: contains not printable characters */
    public static void m6564(Object obj) {
        if (C0051.m8216() <= 0) {
            ((r) obj).C();
        }
    }

    /* renamed from: ۦۨۤۧ, reason: contains not printable characters */
    public static String m6565(Object obj, Object obj2) {
        if (C0005.m1599() < 0) {
            return ((String) obj).toLowerCase((Locale) obj2);
        }
        return null;
    }

    /* renamed from: ۧ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m6566(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((C0344d) obj).b;
        }
        return null;
    }

    /* renamed from: ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static int m6567(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0023.m4566() <= 0) {
            return ((Deflater) obj).deflate((byte[]) obj2, i, i2, i3);
        }
        return 0;
    }

    /* renamed from: ۣۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static ImageButton m6568(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((w) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۧۡۨ, reason: not valid java name and contains not printable characters */
    public static void m6569(Object obj, Object obj2, Object obj3) {
        if (C0024.m4693() <= 0) {
            ((g1) obj).d((P) obj2, (C0174a) obj3);
        }
    }

    /* renamed from: ۧۨۧ۟, reason: not valid java name and contains not printable characters */
    public static int m6570(Object obj) {
        if (C0064.m9659() < 0) {
            return ((F) obj).a;
        }
        return 0;
    }

    /* renamed from: ۧۨۨۤ, reason: not valid java name and contains not printable characters */
    public static String m6571(Object obj, Object obj2) {
        if (C0035.m6140() < 0) {
            return ((AppYsV2) obj).c((String) obj2);
        }
        return null;
    }

    /* renamed from: ۨۡۦۤ, reason: not valid java name and contains not printable characters */
    public static int[] m6572(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((com.github.catvod.spider.merge.I.j) obj).a;
        }
        return null;
    }

    /* renamed from: ۨۢۥۨ, reason: not valid java name and contains not printable characters */
    public static C0233B m6573() {
        if (C0064.m9659() <= 0) {
            return z.a;
        }
        return null;
    }

    /* renamed from: ۣۨۦۦ, reason: not valid java name and contains not printable characters */
    public static String m6574(Object obj) {
        if (C0062.m9429() > 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).q;
        }
        return null;
    }

    /* renamed from: ۣۨۧۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.d m6575(Object obj, Object obj2) {
        if (C0062.m9429() >= 0) {
            return ((h) obj).g((o) obj2);
        }
        return null;
    }

    /* renamed from: ۨۥۥۤ, reason: not valid java name and contains not printable characters */
    public static Class m6576() {
        if (C0019.m4065() < 0) {
            return Float.TYPE;
        }
        return null;
    }

    /* renamed from: ۨۦۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6577(Object obj) {
        if (C0016.m3596() < 0) {
            return ((View) obj).isShown();
        }
        return false;
    }

    /* renamed from: ۨۧۨۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.d0.d m6578(Object obj) {
        if (C0007.m1886() > 0) {
            return ((com.github.catvod.spider.merge.d0.c) obj).b;
        }
        return null;
    }

    /* renamed from: ۤۥۤ۠, reason: not valid java name and contains not printable characters */
    public static String m6551(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}