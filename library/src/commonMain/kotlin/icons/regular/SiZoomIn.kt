package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiZoomIn: ImageVector
    get() {
        if (_SiZoomIn != null) {
            return _SiZoomIn!!
        }
        _SiZoomIn = ImageVector.Builder(
            name = "Regular.SiZoomIn",
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
                moveToRelative(21f, 21f)
                lineToRelative(-4f, -4f)
                moveToRelative(-9f, -6f)
                horizontalLineToRelative(6f)
                moveToRelative(-3f, 3f)
                verticalLineTo(8f)
                moveToRelative(8f, 3f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
            }
        }.build()

        return _SiZoomIn!!
    }

@Suppress("ObjectPropertyName")
private var _SiZoomIn: ImageVector? = null
