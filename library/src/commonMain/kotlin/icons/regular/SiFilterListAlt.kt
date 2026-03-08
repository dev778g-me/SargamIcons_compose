package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiFilterListAlt: ImageVector
    get() {
        if (_SiFilterListAlt != null) {
            return _SiFilterListAlt!!
        }
        _SiFilterListAlt = ImageVector.Builder(
            name = "Regular.SiFilterListAlt",
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
                moveTo(6f, 10f)
                horizontalLineToRelative(12f)
                moveTo(8f, 14f)
                horizontalLineToRelative(8f)
                moveToRelative(-6f, 4f)
                horizontalLineToRelative(4f)
                moveTo(4f, 6f)
                horizontalLineToRelative(16f)
            }
        }.build()

        return _SiFilterListAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiFilterListAlt: ImageVector? = null
