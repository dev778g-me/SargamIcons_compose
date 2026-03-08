package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiDownLeft: ImageVector
    get() {
        if (_SiDownLeft != null) {
            return _SiDownLeft!!
        }
        _SiDownLeft = ImageVector.Builder(
            name = "Duotone.SiDownLeft",
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
                moveTo(5f, 15f)
                horizontalLineToRelative(9.6f)
                arcToRelative(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.4f, -4.4f)
                verticalLineTo(5f)
                moveTo(5f, 15f)
                lineToRelative(4f, 4f)
                moveToRelative(-4f, -4f)
                lineToRelative(4f, -4f)
            }
        }.build()

        return _SiDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _SiDownLeft: ImageVector? = null
