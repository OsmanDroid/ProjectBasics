package osmandroid.project_basics;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class Task extends Activity{

    public static void RateApp(Context c,String PackageName){
        String attach ="details?id=";
            xmethod(c,attach+PackageName);
    }

    public static void FollowOnFb(Context c,String PageId,String PageLink){
        Intent fbintent;
        try {
            fbintent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/"+PageId));
            c.startActivity(fbintent);
        } catch (Exception e) {
            fbintent = new Intent(Intent.ACTION_VIEW, Uri.parse(PageLink));
            c.startActivity(fbintent);
        }

    }

    public static void MoreApps(Context c,String Dev_Name){
        String attach ="developer?id=";
        xmethod(c,attach+Dev_Name);
    }

    public static void Feedback(Context c,String Mail,String Subject){
        Intent intentmail = new Intent(Intent.ACTION_VIEW);
        Uri datas = Uri.parse("mailto:"+Mail+"?subject="+Subject);
        intentmail.setData(datas);
        c.startActivity(intentmail);
    }

    public static void ShareApp(Context c,String PackageName,String Subject,String Description){
        String applink = "https://play.google.com/store/apps/"+PackageName;
        Intent share =new Intent(Intent.ACTION_SEND);
        share.setType("text/plain");
        share.putExtra(Intent.EXTRA_SUBJECT,Subject);
        share.putExtra(Intent.EXTRA_TEXT,Description+": "+applink);
        c.startActivity(Intent.createChooser(share,"Share via"));
    }

    public static void CopyText(Context c,String text){
        ClipboardManager clipboardManager = (ClipboardManager) c.getSystemService(CLIPBOARD_SERVICE);
        ClipData clipData = ClipData.newPlainText("Text Copied",text);
           if (clipboardManager != null) {
               clipboardManager.setPrimaryClip(clipData);
               Toast.makeText(c, "Text Copied", Toast.LENGTH_SHORT).show();
           }
    }

    @SuppressLint("InlinedApi")
    private static   void xmethod(Context c, String name) {
        String applink = "https://play.google.com/store/apps/";
        Uri love = Uri.parse("market://" + name);
        Intent lc = new Intent(Intent.ACTION_VIEW, love);
        //noinspection deprecation
        lc.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET |
                Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        try {
            c.startActivity(lc);
        } catch (ActivityNotFoundException e) {
            c.startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse(applink + name)));
        }
    }


}
