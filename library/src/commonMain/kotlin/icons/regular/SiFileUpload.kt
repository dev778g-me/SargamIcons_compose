package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiFileUpload: ImageVector
    get() {
        if (_SiFileUpload != null) {
            return _SiFileUpload!!
        }
        _SiFileUpload = ImageVector.Builder(
            name = "Regular.SiFileUpload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(8f, 8f)
                lineToRelative(4f, -4f)
                moveToRelative(0f, 0f)
                lineToRelative(4f, 4f)
                moveToRelative(-4f, -4f)
                verticalLineToRelative(12f)
                moveToRelative(7f, 1f)
                verticalLineToRelative(0.6f)
                curveToRelative(0f, 1.33f, -1.07f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(7.4f)
                curveTo(6.07f, 20f, 5f, 18.93f, 5f, 17.6f)
                verticalLineTo(17f)
            }
        }.build()

        return _SiFileUpload!!
    }

@Suppress("ObjectPropertyName")
private var _SiFileUpload: ImageVector? = null
