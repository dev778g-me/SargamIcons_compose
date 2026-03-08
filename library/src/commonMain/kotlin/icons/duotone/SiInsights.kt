package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiInsights: ImageVector
    get() {
        if (_SiInsights != null) {
            return _SiInsights!!
        }
        _SiInsights = ImageVector.Builder(
            name = "Duotone.SiInsights",
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
                moveTo(21f, 21f)
                horizontalLineTo(3.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.8f, -0.8f)
                verticalLineTo(3f)
                moveToRelative(3f, 11f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                lineToRelative(7f, -7f)
            }
        }.build()

        return _SiInsights!!
    }

@Suppress("ObjectPropertyName")
private var _SiInsights: ImageVector? = null
