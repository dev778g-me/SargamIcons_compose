package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiFileUpload: ImageVector
    get() {
        if (_SiFileUpload != null) {
            return _SiFileUpload!!
        }
        _SiFileUpload = ImageVector.Builder(
            name = "Duotone.SiFileUpload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.47f, 7.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 1.06f)
                close()
                moveTo(12f, 4f)
                lineToRelative(0.53f, -0.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 0f)
                close()
                moveTo(15.47f, 8.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, -1.06f)
                close()
                moveTo(11.25f, 16f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
                moveTo(19.75f, 17f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                close()
                moveTo(5.75f, 17f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                close()
                moveTo(8.53f, 8.53f)
                lineTo(12.53f, 4.53f)
                lineTo(11.47f, 3.47f)
                lineTo(7.47f, 7.47f)
                close()
                moveTo(11.47f, 4.53f)
                lineTo(15.47f, 8.53f)
                lineTo(16.53f, 7.47f)
                lineTo(12.53f, 3.47f)
                close()
                moveTo(11.25f, 4f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(1.5f)
                lineTo(12.75f, 4f)
                close()
                moveTo(18.25f, 17f)
                verticalLineToRelative(0.6f)
                horizontalLineToRelative(1.5f)
                lineTo(19.75f, 17f)
                close()
                moveTo(18.25f, 17.6f)
                curveToRelative(0f, 0.916f, -0.734f, 1.65f, -1.65f, 1.65f)
                verticalLineToRelative(1.5f)
                arcToRelative(3.144f, 3.144f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.15f, -3.15f)
                close()
                moveTo(16.6f, 19.25f)
                lineTo(7.4f, 19.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(9.2f)
                close()
                moveTo(7.4f, 19.25f)
                curveToRelative(-0.916f, 0f, -1.65f, -0.734f, -1.65f, -1.65f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(3.144f, 3.144f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.15f, 3.15f)
                close()
                moveTo(5.75f, 17.6f)
                lineTo(5.75f, 17f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(0.6f)
                close()
            }
        }.build()

        return _SiFileUpload!!
    }

@Suppress("ObjectPropertyName")
private var _SiFileUpload: ImageVector? = null
