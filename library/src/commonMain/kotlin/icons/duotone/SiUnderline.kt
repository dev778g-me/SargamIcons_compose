package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiUnderline: ImageVector
    get() {
        if (_SiUnderline != null) {
            return _SiUnderline!!
        }
        _SiUnderline = ImageVector.Builder(
            name = "Duotone.SiUnderline",
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
                moveTo(18f, 3f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 3.3f, -2.7f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.7f, -6f, -6f)
                verticalLineTo(3f)
                moveTo(4f, 21f)
                horizontalLineToRelative(16f)
                moveTo(4f, 3f)
                horizontalLineToRelative(4f)
                moveToRelative(8f, 0f)
                horizontalLineToRelative(4f)
            }
        }.build()

        return _SiUnderline!!
    }

@Suppress("ObjectPropertyName")
private var _SiUnderline: ImageVector? = null
