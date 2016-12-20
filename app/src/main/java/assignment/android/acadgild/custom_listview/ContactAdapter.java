package assignment.android.acadgild.custom_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by DivyaVipin on 12/19/2016.
 */
public class ContactAdapter  extends ArrayAdapter<String>{

    String[] names={};
    String[] phoneNo={};
    int[] image={};
    Context c;
    LayoutInflater inflator;

    public ContactAdapter(Context context,String[] names,String[] phoneNo,int[] image) {
        super(context,R.layout.listitem_row,names);
        this.names=names;
        this.phoneNo=phoneNo;
        this.c=context;
        this.image=image;
    }
    public class ViewHolder
    {
        TextView contactName;
        TextView contactPhone;
        ImageView contactImage;


    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            inflator=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflator.inflate(R.layout.listitem_row,null);

        }
        final ViewHolder holder=new ViewHolder();
        holder.contactName=(TextView)convertView.findViewById(R.id.textViewName);
        holder.contactPhone=(TextView)convertView.findViewById(R.id.textViewPhoneNo);
        holder.contactImage=(ImageView)convertView.findViewById(R.id.imageViewContact);
        holder.contactImage.setImageResource(image[position]);
        holder.contactName.setText(names[position]);
        holder.contactPhone.setText(phoneNo[position]);
        return convertView;
    }
}
