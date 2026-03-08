package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiActivity: ImageVector
    get() {
        if (_SiActivity != null) {
            return _SiActivity!!
        }
        _SiActivity = ImageVector.Builder(
            name = "Regular.SiActivity",
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
                moveTo(1f, 12f)
                horizontalLineToRelative(4f)
                lineToRelative(4f, 9f)
                lineToRelative(7f, -18f)
                lineToRelative(3f, 9f)
                horizontalLineToRelative(4f)
            }
        }.build()

        return _SiActivity!!
    }

@Suppress("ObjectPropertyName")
private var _SiActivity: ImageVector? = null
