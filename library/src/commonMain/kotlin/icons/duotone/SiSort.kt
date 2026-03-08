package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiSort: ImageVector
    get() {
        if (_SiSort != null) {
            return _SiSort!!
        }
        _SiSort = ImageVector.Builder(
            name = "Duotone.SiSort",
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
                moveTo(4f, 12f)
                horizontalLineToRelative(12f)
                moveTo(4f, 8f)
                horizontalLineToRelative(16f)
                moveTo(4f, 16f)
                horizontalLineToRelative(8f)
            }
        }.build()

        return _SiSort!!
    }

@Suppress("ObjectPropertyName")
private var _SiSort: ImageVector? = null
